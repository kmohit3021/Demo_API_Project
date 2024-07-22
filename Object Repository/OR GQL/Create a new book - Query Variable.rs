<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create a new book - Query Variable</name>
   <tag></tag>
   <elementGuidId>06b139b5-82a2-4ce9-aea9-71032051779b</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;query\&quot;: \&quot;mutation MyQuery($id:ID!,$title:String!,$isbn:String!,$pageCount:Int){ newBook(id:$id,title:$title,isbn:$isbn,pageCount:$pageCount,author:1) { id title isbn pageCount author { id firstName lastName } } }\&quot;,\n  \&quot;variables\&quot;: \&quot;{ \\\&quot;id\\\&quot;:\\\&quot;${id}\\\&quot;, \\\&quot;title\\\&quot;:\\\&quot;${title}\\\&quot;, \\\&quot;isbn\\\&quot;:\\\&quot;${isbn}\\\&quot;, \\\&quot;pageCount\\\&quot;:\\\&quot;${pageCount}\\\&quot; }\&quot;\n}&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;,
  &quot;displayText&quot;: &quot;mutation MyQuery($id:ID!,$title:String!,$isbn:String!,$pageCount:Int){\n  newBook(id:$id,title:$title,isbn:$isbn,pageCount:$pageCount,author:1) {\n    id\n    title\n    isbn\n    pageCount\n    author {\n        id\n        firstName\n        lastName\n    }\n  }\n}&quot;,
  &quot;displayVariables&quot;: &quot;{\n  \&quot;id\&quot;:\&quot;${id}\&quot;,\n  \&quot;title\&quot;:\&quot;${title}\&quot;,\n  \&quot;isbn\&quot;:\&quot;${isbn}\&quot;,\n  \&quot;pageCount\&quot;:\&quot;${pageCount}\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;
}</httpBodyContent>
   <httpBodyType>GraphQL</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>e1227bb6-1a37-4b23-a42d-20d253c40f77</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.3.5</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://katalon-sample-graphql-aut.herokuapp.com/graphql</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>'Mohit003'</defaultValue>
      <description></description>
      <id>2cfb6d93-809a-47b0-abf5-9e3ab3f7582f</id>
      <masked>false</masked>
      <name>title</name>
   </variables>
   <variables>
      <defaultValue>'ISBN003'</defaultValue>
      <description></description>
      <id>ce28711f-2cab-490b-9751-2055a25d1495</id>
      <masked>false</masked>
      <name>isbn</name>
   </variables>
   <variables>
      <defaultValue>'3'</defaultValue>
      <description></description>
      <id>7bb1b821-94a3-484d-adbd-5f9356b26438</id>
      <masked>false</masked>
      <name>id</name>
   </variables>
   <variables>
      <defaultValue>'150'</defaultValue>
      <description></description>
      <id>5b47f282-c5f8-45ff-9956-aacbbf1bb6e5</id>
      <masked>false</masked>
      <name>pageCount</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

WS.verifyElementPropertyValue(response, 'data.country.capital', &quot;Hanoi&quot;)
WS.verifyElementPropertyValue(response, 'data.country.name', &quot;Vietnam&quot;)
WS.verifyElementPropertyValue(response, 'data.country.native', &quot;Việt Nam&quot;)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
