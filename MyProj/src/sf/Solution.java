package sf;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.sql.Timestamp;
import java.util.regex.*;

public class Solution {

	public static void main(String args[]) throws Exception {

		for (int i = 0; i < 100; i++) {
			int res = i % 10;
			RequestDetails req = null;
			if (i <= 3) {
				req = new RequestDetails("A", "LOW");
			} else if (i > 3 && i <= 6) {
				req = new RequestDetails("B", "MEDIUM");
			} else { // if i>6 && i<9
				req = new RequestDetails("C", "HIGH");
			}
			try {
				API.invoke(req);
			} catch (ApiException e) {
				System.out.println(req.client + " >>>> " + e.getMessage());
			}
		}
	}
}

class ApiException extends RuntimeException {
	public ApiException() {
		super("Api limit exhausted. Try again after 30 mins");
	}
}

class API {

	static Timestamp now;
	public static Map<Timestamp, RequestDetails> reqPool = new HashMap();

	public static boolean invoke(RequestDetails req) throws Exception {
		now = new Timestamp(System.currentTimeMillis());
		validate(req);
		reqPool.put(now, req);
		return execute(req);
	}

	static void validate(RequestDetails req) throws Exception {
		ApiLimiter.get(req).validate();
	}

	static boolean execute(RequestDetails req) {
		return true;
	}
}

class RequestDetails {
	String client;
	ApiLicence licence;

	RequestDetails(String client, String type) {
		this.client = client;
		this.licence = ApiLicence.getLicence(type);
	}
}

abstract class ApiLimiter {
	protected String reqClient;
	protected int allowedReqCount;

	enum TYPE {
		LOW(10), MEDIUM(20), HIGH(50);

		int allowedReq;

		TYPE(int allowedReq) {
			this.allowedReq = allowedReq;
		}

	}

	static ApiLimiter get(RequestDetails req) throws Exception {
		switch (req.licence.type) {
		case LOW:
			return new LowLimiter(req.client, req.licence.type.allowedReq);
		case MEDIUM:
			return new MediumLimiter(req.client, req.licence.type.allowedReq);
		case HIGH:
			return new HighLimiter(req.client, req.licence.type.allowedReq);
		default:
			throw new RuntimeException("no licence");
		}
	}

	void validate() throws ApiException {

		int countInMin = 0;

		for (Timestamp t : API.reqPool.keySet()) {
			if (!API.reqPool.get(t).client.equalsIgnoreCase(reqClient) || t.after(API.now)) {
				continue;
			}
			if ((t.getTime() - API.now.getTime()) < 1000) {
				countInMin++;
			}
			if (countInMin > allowedReqCount) {
				throw new ApiException();
			}
		}
	}
}

class LowLimiter extends ApiLimiter {
	public LowLimiter(String reqClient, int allowedReqCount) {
		super.reqClient = reqClient;
		super.allowedReqCount = allowedReqCount;
	}

}

class MediumLimiter extends ApiLimiter {
	public MediumLimiter(String reqClient, int allowedReqCount) {
		super.reqClient = reqClient;
		super.allowedReqCount = allowedReqCount;
	}

}

class HighLimiter extends ApiLimiter {
	public HighLimiter(String reqClient, int allowedReqCount) {
		super.reqClient = reqClient;
		super.allowedReqCount = allowedReqCount;
	}

}

class ApiLicence {
	static final Map<ApiLimiter.TYPE, ApiLicence> licList = new HashMap<>();
	static {
		licList.put(ApiLimiter.TYPE.LOW, new ApiLicence(ApiLimiter.TYPE.LOW));
		licList.put(ApiLimiter.TYPE.MEDIUM, new ApiLicence(ApiLimiter.TYPE.MEDIUM));
		licList.put(ApiLimiter.TYPE.HIGH, new ApiLicence(ApiLimiter.TYPE.HIGH));
	}
	ApiLimiter.TYPE type;

	private ApiLicence(ApiLimiter.TYPE type) {
		this.type = type;
	}

	static ApiLicence getLicence(String type) {
		return licList.get(ApiLimiter.TYPE.valueOf(type));
	}
}