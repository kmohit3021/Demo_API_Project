<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Auth with JWT</name>
   <tag></tag>
   <elementGuidId>925a092a-ed3c-4bd0-b5da-27d0aa6d30e1</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <authorizationRequest>
      <authorizationInfo>
         <entry>
            <key>bearerToken</key>
            <value>eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOjEsImlhdCI6MTcyMTI0MjM0OCwiZXhwIjoxNzIyOTcwMzQ4fQ.qSTgDBXQYyp9srlXpgd8TnTtkbpYQzkXqRDmae6lhw4</value>
         </entry>
      </authorizationInfo>
      <authorizationType>Bearer</authorizationType>
   </authorizationRequest>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;email\&quot;: \&quot;${loc_Email}\&quot;,\n  \&quot;password\&quot;: \&quot;${loc_Password}\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>406a41f6-b6b3-4712-837f-cef78fa1dbb3</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>0d0b5a24-a839-429a-95e2-3a638b62cfd5</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOjEsImlhdCI6MTcyMTI0MjM0OCwiZXhwIjoxNzIyOTcwMzQ4fQ.qSTgDBXQYyp9srlXpgd8TnTtkbpYQzkXqRDmae6lhw4</value>
      <webElementGuid>aa22601b-e198-4fa1-942e-267472ed7e1a</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.6.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://api.escuelajs.co/api/v1/auth/login</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>'john@mail.com'</defaultValue>
      <description></description>
      <id>a958abe6-fd4b-448a-a7f5-9ee70e3c9063</id>
      <masked>false</masked>
      <name>loc_Email</name>
   </variables>
   <variables>
      <defaultValue>'changeme'</defaultValue>
      <description></description>
      <id>1bc6adf4-866f-4827-aea4-2a77bfd1f209</id>
      <masked>false</masked>
      <name>loc_Password</name>
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


WS.verifyElementPropertyValue(response, 'access_token', &quot;eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOjEsImlhdCI6MTcyMTI0MTE4NiwiZXhwIjoxNzIyOTY5MTg2fQ.q0qO3rHto0A2VPe101DFo7i-7Y89CqF6bxTogg9pRg8&quot;)
WS.verifyElementPropertyValue(response, 'refresh_token', &quot;eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOjEsImlhdCI6MTcyMTI0MTE4NiwiZXhwIjoxNzIxMjc3MTg2fQ.OwZBfSCDFOHOya210ytBbW7drCF2taobxy8Uwygozlo&quot;)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
