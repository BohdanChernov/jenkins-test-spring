/*
To perform the script just write 'groovy script_name.groovy'
 */

@GrabConfig( systemClassLoader=true )
//@Grab(group='com.oracle.database.jdbc', module='ojdbc8', version='19.8.0.0')
@Grab(group='org.postgresql', module='postgresql', version='42.2.10')

import java.sql.*;
import groovy.sql.Sql
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


// Creating a connection to the database
def sql = Sql.newInstance('jdbc:postgresql://35.224.189.15:5432/test',
        'postgres', 'postgres', 'org.postgresql.Driver')

// Executing the query SELECT VERSION which gets the version of the database
// Also using the eachROW method to fetch the result from the database

sql.eachRow('SELECT * from test_table'){ row ->
    println row
    String id = row.id
    String test_name = row.test_name

    Path currentDir = Paths.get(".");
//    System.out.println(currentDir.toAbsolutePath());

    Path newFilePath = Paths.get('./files/' + id + '.txt')
    Files.createFile(newFilePath)

}

def test() {
    echo 'Hello World Download'
}



sql.close()