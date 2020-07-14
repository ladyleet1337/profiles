[{"Name":"PASSIVE-Errors_Vulns_Detect","Active":true,"Scanner":2,"Author":"@GochaOqradze","Payloads":[],"Encoder":[],"UrlEncode":false,"CharsToUrlEncode":"","Grep":["injectx|\\*\\*\\* stack smashing detected \\*\\*\\*|Backtrace|Memory map|500 Internal Server Error|Set-Cookie:\\scrlf\u003dinjection|java\\.io\\.FileNotFoundException|java\\.lang\\.Exception|java\\.lang\\.IllegalArgumentException|java\\.net\\.MalformedURLException|Warning: include\\(|Warning: unlink\\(|for inclusion \\(include_path\u003d|fread\\(|Failed opening required|Warning: file_get_contents\\(|Fatal error: require_once\\(|Warning: file_exists\\(|root:x|for 16-bit app support|boot loader|root:x|(uid|gid|groups)\u003d\\d+|bytes from 127\\.0\\.0\\.1|Configuration File \\(php\\.ini\\) Path |vulnerable 1|Trying 135\\.23\\.158\\.130|127\\.0\\.0\\.1\\s+localhost|BROADCAST,MULTICAST|drwxr-xr|Active Internet connections|(Exception (condition )?\\d+\\. Transaction rollback|com\\.frontbase\\.jdbc|org\\.h2\\.jdbc|Unexpected end of command in statement \\[\"|Unexpected token.*?in statement \\[|org\\.hsqldb\\.jdbc|CLI Driver.*?DB2|DB2 SQL error|\\bdb2_\\w+\\(|SQLSTATE.+SQLCODE|com\\.ibm\\.db2\\.jcc|Zend_Db_(Adapter|Statement)_Db2_Exception|Pdo[./_\\\\]Ibm|DB2Exception|Warning.*?\\Wifx_|Exception.*?Informix|Informix ODBC Driver|ODBC Informix driver|com\\.informix\\.jdbc|weblogic\\.jdbc\\.informix|Pdo[./_\\\\]Informix|IfxException|Warning.*?\\Wingres_|Ingres SQLSTATE|Ingres\\W.*?Driver|com\\.ingres\\.gcf\\.jdbc|Dynamic SQL Error|Warning.*?\\Wibase_|org\\.firebirdsql\\.jdbc|Pdo[./_\\\\]Firebird|Microsoft Access (\\d+ )?Driver|JET Database Engine|Access Database Engine|ODBC Microsoft Access|Syntax error \\(missing operator\\) in query expression|Driver.*? SQL[\\-\\_\\ ]*Server|OLE DB.*? SQL Server|\\bSQL Server[^\u0026lt;\u0026quot;]+Driver|Warning.*?\\W(mssql|sqlsrv)_|\\bSQL Server[^\u0026lt;\u0026quot;]+[0-9a-fA-F]{8}|System\\.Data\\.SqlClient\\.SqlException|(?s)Exception.*?\\bRoadhouse\\.Cms\\.|Microsoft SQL Native Client error \u0027[0-9a-fA-F]{8}|\\[SQL Server\\]|ODBC SQL Server Driver|ODBC Driver \\d+ for SQL Server|SQLServer JDBC Driver|com\\.jnetdirect\\.jsql|macromedia\\.jdbc\\.sqlserver|Zend_Db_(Adapter|Statement)_Sqlsrv_Exception|com\\.microsoft\\.sqlserver\\.jdbc|Pdo[./_\\\\](Mssql|SqlSrv)|SQL(Srv|Server)Exception|SQL syntax.*?MySQL|Warning.*?\\Wmysqli?_|MySQLSyntaxErrorException|valid MySQL result|check the manual that corresponds to your (MySQL|MariaDB) server version|Unknown column \u0027[^ ]+\u0027 in \u0027field list\u0027|MySqlClient\\.|com\\.mysql\\.jdbc|Zend_Db_(Adapter|Statement)_Mysqli_Exception|Pdo[./_\\\\]Mysql|MySqlException|\\bORA-\\d{5}|Oracle error|Oracle.*?Driver|Warning.*?\\W(oci|ora)_|quoted string not properly terminated|SQL command not properly ended|macromedia\\.jdbc\\.oracle|oracle\\.jdbc|Zend_Db_(Adapter|Statement)_Oracle_Exception|Pdo[./_\\\\](Oracle|OCI)|OracleException|PostgreSQL.*?ERROR|Warning.*?\\Wpg_|valid PostgreSQL result|Npgsql\\.|PG::SyntaxError:|org\\.postgresql\\.util\\.PSQLException|ERROR:\\s\\ssyntax error at or near|ERROR: parser: parse error at or near|PostgreSQL query failed|org\\.postgresql\\.jdbc|Pdo[./_\\\\]Pgsql|PSQLException|SQL error.*?POS([0-9]+)|Warning.*?\\Wmaxdb_|DriverSapDB|com\\.sap\\.dbtech\\.jdbc|SQLite/JDBCDriver|SQLite\\.Exception|(Microsoft|System)\\.Data\\.SQLite\\.SQLiteException|Warning.*?\\W(sqlite_|SQLite3::)|\\[SQLITE_ERROR\\]|SQLite error \\d+:|sqlite3.OperationalError:|SQLite3::SQLException|org\\.sqlite\\.JDBC|Pdo[./_\\\\]Sqlite|SQLiteException|Warning.*?\\Wsybase_|Sybase message|Sybase.*?Server message|SybSQLException|Sybase\\.Data\\.AseClient|com\\.sybase\\.jdbc)|System\\.Xml\\.XPath\\.XPathException|MS\\.Internal\\.Xml|Unknown error in XPath|org\\.apache\\.xpath\\.XPath|A closing bracket expected in|An operand in Union Expression does not produce a node-set|Cannot convert expression to a number|Document Axis does not allow any context Location Steps|Empty Path Expression|DOMXPath|Empty Relative Location Path|Empty Union Expression|Expected \\\u0027\\)\\\u0027 in|Expected node test or name specification after axis operator|Incompatible XPath key|Incorrect Variable Binding|libxml2 library function failed|libxml2|Invalid predicate|Invalid expression|xmlsec library function|xmlsec|error \\\u002780004005\\\u0027|A document must contain exactly one root element|\u003cfont face\u003d\"Arial\" size\u003d2\u003eExpression must evaluate to a node-set|Expected token \u0027]\u0027|\u003cp\u003emsxml4\\.dll\u003c\\/font\u003e|\u003cp\u003emsxml3\\.dll\u003c\\/font\u003e|4005 Notes error: Query is not understandable|SimpleXMLElement::xpath|xmlXPathEval:|simplexml_load_string|parser error :|An error occured!|xmlParseEntityDecl|simplexml_load_string|xmlParseInternalSubset|DOCTYPE improperly terminated|Start tag expected|No declaration for attribute|No declaration for element|failed to load external entity|Start tag expected|Invalid URI: file:\\/\\/\\/|Malformed declaration expecting version|Unicode strings with encoding|must be well-formed|Content is not allowed in prolog|org.xml.sax|SAXParseException|com.sun.org.apache.xerces|ParseError|nokogiri|REXML|XML syntax error on line|Error unmarshaling XML|conflicts with field|illegal character code|XML Parsing Error|SyntaxError|no root element|not well-formed"],"Tags":["All"],"PayloadResponse":false,"NotResponse":false,"TimeOut":"","isTime":false,"contentLength":"","iscontentLength":false,"CaseSensitive":false,"ExcludeHTTP":false,"OnlyHTTP":false,"IsContentType":false,"ContentType":"","NegativeCT":false,"IsResponseCode":false,"ResponseCode":"","NegativeRC":false,"MatchType":2,"RedirType":0,"MaxRedir":0,"payloadPosition":1,"payloadsFile":"","grepsFile":"","IssueName":"Errors And Vulnerabilities Detect","IssueSeverity":"Medium","IssueConfidence":"Firm","IssueDetail":"Error and vulnerabilities detections","RemediationDetail":"","IssueBackground":"More info and source\nhttps://github.com/ghsec/webHunt","RemediationBackground":"","Header":[],"VariationAttributes":[],"InsertionPointType":[0],"pathDiscovery":false}]