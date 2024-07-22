<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Find book by ID</name>
   <tag></tag>
   <elementGuidId>6dc6287c-e06b-4085-8fb5-3f95d1e7781b</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;query\&quot;: \&quot;query newBook { findBook(id: 1) { id isbn pageCount title } }\&quot;,\n  \&quot;variables\&quot;: \&quot;{ \\\&quot;$idvalue\\\&quot;:\\\&quot;1\\\&quot; }\&quot;\n}&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;,
  &quot;displayText&quot;: &quot;query newBook {\n  findBook(id: 1) {\n    id\n    isbn\n    pageCount\n    title\n  }\n}&quot;,
  &quot;displayVariables&quot;: &quot;{\n  \&quot;$idvalue\&quot;:\&quot;1\&quot; \n}&quot;,
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
      <defaultValue>'3'</defaultValue>
      <description></description>
      <id>5981e618-9215-4eef-bb36-291cd045e3ff</id>
      <masked>false</masked>
      <name>id</name>
   </variables>
   <variables>
      <defaultValue>'Mohit'</defaultValue>
      <description></description>
      <id>d1b68d4c-eaed-4ded-ad19-dcaa5296daf9</id>
      <masked>false</masked>
      <name>strTitle</name>
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
