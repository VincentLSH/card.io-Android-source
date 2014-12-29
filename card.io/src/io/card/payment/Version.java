package io.card.payment;

/* Version.java
 * See the file "LICENSE.md" for the full license governing this code.
 */

import io.card.development.BuildConfig;

public class Version {
    public static final String REVISION = BuildConfig.PRODUCT_VERSION;
    public static final String PRODUCT_NAME = BuildConfig.PRODUCT_NAME;
    public static final String BUILD_DATE = BuildConfig.BUILD_TIME;
}
