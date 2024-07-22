<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>New Request</name>
   <tag></tag>
   <elementGuidId>6d47221f-8271-4a2b-af68-2a122ed2cf09</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;query\&quot;: \&quot;query Query ($id: ID!){ country(code: \\\&quot;VN\\\&quot;) { name native capital emoji currency languages { code name } } }\&quot;,\n  \&quot;variables\&quot;: \&quot;{ \\\&quot;id\\\&quot;: \\\&quot;VN\\\&quot; }\&quot;\n}&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;,
  &quot;displayText&quot;: &quot;query Query ($id: ID!){\n  country(code: \&quot;VN\&quot;) {\n    name\n    native\n    capital\n    emoji\n    currency\n    languages {\n      code\n      name\n    }\n  }\n}&quot;,
  &quot;displayVariables&quot;: &quot;{\n  \&quot;id\&quot;: \&quot;VN\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;
}</httpBodyContent>
   <httpBodyType>GraphQL</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>ffe81621-78c9-4129-be0c-0026cd34f6ed</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.4.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://countries.trevorblades.com</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <validationSteps>
      <id>f4d2ed6d-4744-4191-a5c7-74fda33438cf</id>
      <name>New Validation</name>
      <type>AUTO_DETECT</type>
      <dataType>AUTO</dataType>
      <target>RESPONSE</target>
      <data></data>
      <activate>true</activate>
   </validationSteps>
   <variables>
      <defaultValue>'VN'</defaultValue>
      <description></description>
      <id>4273183c-8999-48c6-a173-feb871519c2a</id>
      <masked>false</masked>
      <name>idm</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
