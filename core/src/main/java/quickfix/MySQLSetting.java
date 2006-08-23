/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved. 
 * 
 * This file is part of the QuickFIX FIX Engine 
 * 
 * This file may be distributed under the terms of the quickfixengine.org 
 * license as defined by quickfixengine.org and appearing in the file 
 * LICENSE included in the packaging of this file. 
 * 
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING 
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A 
 * PARTICULAR PURPOSE. 
 * 
 * See http://www.quickfixengine.org/LICENSE for licensing information. 
 * 
 * Contact ask@quickfixengine.org if any conditions of this licensing 
 * are not clear to you.
 ******************************************************************************/

package quickfix;

/**
 * Setting keys for MySQL store and log.
 *  
 * @deprecated Use the generic JDBC support instead.
 * 
 * @see quickfix.JdbcSetting
 */
public class MySQLSetting {
    /**
     * Setting for MySQL database name. The store-related key is used for both
     * the MySQL store and the log.
     */
    public static final String SETTING_MYSQL_STORE_DATABASE = "MySQLStoreDatabase";

    /**
     * Setting for MySQL user. The store-related key is used for both the MySQL
     * store and the log.
     */
    public static final String SETTING_MYSQL_STORE_USER = "MySQLStoreUser";

    /**
     * Setting for MySQL password. The store-related key is used for both the
     * MySQL store and the log.
     */
    public static final String SETTING_MYSQL_STORE_PASSWORD = "MySQLStorePassword";

    /**
     * Setting for MySQL host. The store-related key is used for both the MySQL
     * store and the log.
     */
    public static final String SETTING_MYSQL_STORE_HOST = "MySQLStoreHost";

    /**
     * Setting for MySQL port. The store-related key is used for both the MySQL
     * store and the log.
     */
    public static final String SETTING_MYSQL_STORE_PORT = "MySQLStorePort";

    /**
     * Setting for the MySQL port for the log connection.
     */
    public static final String SETTING_MYSQL_LOG_HOST = "MySQLLogHost";

    /**
     * Setting for the MySQL port for the log connection.
     */
    public static final String SETTING_MYSQL_LOG_PORT = "MySQLLogPort";

    /**
     * Setting for the MySQL port for the log database.
     */
    public static final String SETTING_MYSQL_LOG_DATABASE = "MySQLLogDatabase";

    /**
     * Setting for the MySQL port for the log database.
     */
    public static final String SETTING_MYSQL_LOG_USER = "MySQLLogUser";

    /**
     * Setting for the MySQL port for the log database.
     */
    public static final String SETTING_MYSQL_LOG_PASSWORD = "MySQLLogPassword";

}