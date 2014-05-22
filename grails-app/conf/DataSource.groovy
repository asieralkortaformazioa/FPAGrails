/*
dataSource {
    pooled = true
    jmxExport = true
    driverClassName = "org.h2.Driver"
    username = "sa"
    password = ""
}
*/

dataSource {
    driverClassName = "org.apache.derby.jdbc.EmbeddedDriver"
    //dbCreate = "create-drop"
    //url = "jdbc:derby:/mnt/shared/linuxShared/ebooks/FPADB"
    //url = "jdbc:derby:/opt/development/dbs/derby/bin/FPADB"
    //dialect = org.hibernate.dialect.MySQL5InnoDBDialect
    dialect=org.hibernate.dialect.DerbyDialect
}


hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
//    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
    singleSession = true // configure OSIV singleSession mode

}

// environment specific settings
environments {
    development {
        dataSource {
            //dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
            dbCreate = "update"
            //url = "jdbc:h2:mem:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
            //url = "jdbc:derby:/opt/development/dbs/derby/bin/FPADB"
            url = "jdbc:derby:/home/developer/Development/projects/Caf/FPA/FPA_Webapp/db/FPADB"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            //url = "jdbc:h2:mem:testDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
            url = "jdbc:derby:/home/developer/Development/projects/Caf/FPA/FPA_Webapp/db/FPADB"
        }
    }
    production {
        dataSource {
            dbCreate = "update"
            url = "jdbc:derby:/home/developer/Development/projects/Caf/FPA/FPA_Webapp/db/FPADB"
            /*
            url = "jdbc:h2:prodDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
            properties {
               // See http://grails.org/doc/latest/guide/conf.html#dataSource for documentation
               jmxEnabled = true
               initialSize = 5
               maxActive = 50
               minIdle = 5
               maxIdle = 25
               maxWait = 10000
               maxAge = 10 * 60000
               timeBetweenEvictionRunsMillis = 5000
               minEvictableIdleTimeMillis = 60000
               validationQuery = "SELECT 1"
               validationQueryTimeout = 3
               validationInterval = 15000
               testOnBorrow = true
               testWhileIdle = true
               testOnReturn = false
               jdbcInterceptors = "ConnectionState"
               defaultTransactionIsolation = java.sql.Connection.TRANSACTION_READ_COMMITTED
            }
            */
        }
    }
}
