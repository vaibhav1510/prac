/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package sample;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author vaibhav
 */
public class TestTimestamps {

    public static void main(String[] args) throws Exception {
        String s = "2016-08-25T06:31:21.706Z";
        Timestamp out = toTimestampFo(s);
        System.out.println(out);
    }

    public static Timestamp toTimestampFo(String yyyyMmDdString) throws Exception {
        SimpleDateFormat sdf = DateFmts.YYYY_MM_DD_T_HH_MM_SS_SSS.get();
        Date baseDate = sdf.parse(yyyyMmDdString);
        Calendar c = cal(baseDate);
        return new Timestamp(c.getTimeInMillis());

    }

    public static Calendar cal(Date dt) {
        Calendar c = Calendar.getInstance(); // todo: TimeZone handling !! 
        c.setTimeInMillis(dt.getTime());
        return c;
    }
}

interface DateFmts {

    FmtThreadLocal YYYY_MM_DD_HH_MM_SS = new FmtThreadLocal("yyyy-MM-dd HH:mm:ss");

    FmtThreadLocal YYYY_MM_DD_HH_MM_SS_SSS = new FmtThreadLocal("yyyy-MM-dd HH:mm:ss.SSS");

    FmtThreadLocal YYYY_MM_DD_HH_MM_SS_SSS_Z = new FmtThreadLocal("yyyy-MM-dd HH:mm:ss.SSSZ");

    FmtThreadLocal YYYY_MM_DD = new FmtThreadLocal("yyyy-MM-dd");

    FmtThreadLocal DD_MMM_YYYY = new FmtThreadLocal("dd-MMM-yyyy");

    FmtThreadLocal DD_MMM_YYYY_HH_MM_SS = new FmtThreadLocal("dd-MMM-yyyy HH:mm:ss");

    FmtThreadLocal DD_MMM_YYYY_HH_MM = new FmtThreadLocal("dd-MMM-yyyy HH:mm");

    FmtThreadLocal YYYY_MM_DD_T_HH_MM_SS_SSS = new FmtThreadLocal("yyyy-MM-dd'T'HH:mm:ss.SSS");
    FmtThreadLocal YYYY_MM_DD_T_HH_MM_SS_SSS_Z = new FmtThreadLocal("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

    FmtThreadLocal DOWNLOAD_FILE_SUFFIX = new FmtThreadLocal("dd_MMM_yyyy_HH_mm_ss");

    FmtThreadLocal YYYY_MM_DD_HH_MM = new FmtThreadLocal("yyyy-MM-dd HH:mm");

    public class FmtThreadLocal extends ThreadLocal<SimpleDateFormat> {

        final String format;

        public FmtThreadLocal(String format) {
            this.format = format;
        }

        protected SimpleDateFormat initialValue() {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            sdf.setLenient(false);
            return sdf;
        }
    }
}
