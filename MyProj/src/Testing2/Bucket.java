/*
 * Copyright (c) 2014 ChargeBee Inc
 * All Rights Reserved.
 */
package Testing2;

/**
 *
 * @author Vaibhav <vaibhav@chargebee.com>
 */
public abstract class Bucket {

    String bucketKeyName;
    String bucketName = bucketKeyName + ".bucket";
    String bucketUrl = "https://s3.amazonaws.com/" + bucketName;
}
