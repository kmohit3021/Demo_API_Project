<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Test Me Here</name>
   <tag></tag>
   <elementGuidId>a3f5a752-c586-44b1-b81b-141ba04e9cce</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <authorizationRequest>
      <authorizationInfo>
         <entry>
            <key>bearerToken</key>
            <value>eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwidXNlcm5hbWUiOiJlbWlseXMiLCJlbWFpbCI6ImVtaWx5LmpvaG5zb25AeC5kdW1teWpzb24uY29tIiwiZmlyc3ROYW1lIjoiRW1pbHkiLCJsYXN0TmFtZSI6IkpvaG5zb24iLCJnZW5kZXIiOiJmZW1hbGUiLCJpbWFnZSI6Imh0dHBzOi8vZHVtbXlqc29uLmNvbS9pY29uL2VtaWx5cy8xMjgiLCJpYXQiOjE3MjE2MzczNzYsImV4cCI6MTcyMTYzOTE3Nn0.llB4lKyYehwkFkeEBSIDom_v0raXZTRGLy8RAQpP0LA</value>
         </entry>
      </authorizationInfo>
      <authorizationType>Bearer</authorizationType>
   </authorizationRequest>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>0a5b06a1-95aa-46cd-9a6d-b661b691806d</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>ff533b4d-7463-4585-aa66-545b6083986a</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwidXNlcm5hbWUiOiJlbWlseXMiLCJlbWFpbCI6ImVtaWx5LmpvaG5zb25AeC5kdW1teWpzb24uY29tIiwiZmlyc3ROYW1lIjoiRW1pbHkiLCJsYXN0TmFtZSI6IkpvaG5zb24iLCJnZW5kZXIiOiJmZW1hbGUiLCJpbWFnZSI6Imh0dHBzOi8vZHVtbXlqc29uLmNvbS9pY29uL2VtaWx5cy8xMjgiLCJpYXQiOjE3MjE2MzczNzYsImV4cCI6MTcyMTYzOTE3Nn0.llB4lKyYehwkFkeEBSIDom_v0raXZTRGLy8RAQpP0LA</value>
      <webElementGuid>af5f2011-586e-411e-81b4-63052a4e4ceb</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.6.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://dummyjson.com/auth/me</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
WS.verifyElementPropertyValue(response, 'email', &quot;john@mail.com&quot;)
WS.verifyElementPropertyValue(response, 'password', &quot;changeme&quot;)
WS.verifyElementPropertyValue(response, 'name', &quot;Jhon&quot;)
WS.verifyElementPropertyValue(response, 'role', &quot;customer&quot;)


WS.verifyElementPropertyValue(response, 'firstName', &quot;Emily&quot;)
WS.verifyElementPropertyValue(response, 'lastName', &quot;Johnson&quot;)
WS.verifyElementPropertyValue(response, 'maidenName', &quot;Smith&quot;)
WS.verifyElementPropertyValue(response, 'age', 28)
WS.verifyElementPropertyValue(response, 'gender', &quot;female&quot;)
WS.verifyElementPropertyValue(response, 'email', &quot;emily.johnson@x.dummyjson.com&quot;)
WS.verifyElementPropertyValue(response, 'phone', &quot;+81 965-431-3024&quot;)
WS.verifyElementPropertyValue(response, 'username', &quot;emilys&quot;)
WS.verifyElementPropertyValue(response, 'password', &quot;emilyspass&quot;)
WS.verifyElementPropertyValue(response, 'birthDate', &quot;1996-5-30&quot;)
WS.verifyElementPropertyValue(response, 'bloodGroup', &quot;O-&quot;)
WS.verifyElementPropertyValue(response, 'height', 193.24)
WS.verifyElementPropertyValue(response, 'weight', 63.16)
WS.verifyElementPropertyValue(response, 'eyeColor', &quot;Green&quot;)
WS.verifyElementPropertyValue(response, 'hair.color', &quot;Brown&quot;)
WS.verifyElementPropertyValue(response, 'hair.type', &quot;Curly&quot;)
WS.verifyElementPropertyValue(response, 'ip', &quot;42.48.100.32&quot;)
WS.verifyElementPropertyValue(response, 'address.address', &quot;626 Main Street&quot;)
WS.verifyElementPropertyValue(response, 'address.city', &quot;Phoenix&quot;)
WS.verifyElementPropertyValue(response, 'address.state', &quot;Mississippi&quot;)
WS.verifyElementPropertyValue(response, 'address.stateCode', &quot;MS&quot;)
WS.verifyElementPropertyValue(response, 'address.postalCode', &quot;29112&quot;)
WS.verifyElementPropertyValue(response, 'address.coordinates.lat', -)
WS.verifyElementPropertyValue(response, 'address.coordinates.lng', -)
WS.verifyElementPropertyValue(response, 'address.country', &quot;United States&quot;)
WS.verifyElementPropertyValue(response, 'macAddress', &quot;47:fa:41:18:ec:eb&quot;)
WS.verifyElementPropertyValue(response, 'university', &quot;University of Wisconsin--Madison&quot;)
WS.verifyElementPropertyValue(response, 'bank.cardExpire', &quot;03/26&quot;)
WS.verifyElementPropertyValue(response, 'bank.cardNumber', &quot;9289760655481815&quot;)
WS.verifyElementPropertyValue(response, 'bank.cardType', &quot;Elo&quot;)
WS.verifyElementPropertyValue(response, 'bank.currency', &quot;CNY&quot;)
WS.verifyElementPropertyValue(response, 'bank.iban', &quot;YPUXISOBI7TTHPK2BR3HAIXL&quot;)
WS.verifyElementPropertyValue(response, 'company.department', &quot;Engineering&quot;)
WS.verifyElementPropertyValue(response, 'company.name', &quot;Dooley, Kozey and Cronin&quot;)
WS.verifyElementPropertyValue(response, 'company.title', &quot;Sales Manager&quot;)
WS.verifyElementPropertyValue(response, 'company.address.address', &quot;263 Tenth Street&quot;)
WS.verifyElementPropertyValue(response, 'company.address.city', &quot;San Francisco&quot;)
WS.verifyElementPropertyValue(response, 'company.address.state', &quot;Wisconsin&quot;)
WS.verifyElementPropertyValue(response, 'company.address.stateCode', &quot;WI&quot;)
WS.verifyElementPropertyValue(response, 'company.address.postalCode', &quot;37657&quot;)
WS.verifyElementPropertyValue(response, 'company.address.coordinates.lat', 71.814525)
WS.verifyElementPropertyValue(response, 'company.address.coordinates.lng', -)
WS.verifyElementPropertyValue(response, 'company.address.country', &quot;United States&quot;)
WS.verifyElementPropertyValue(response, 'ein', &quot;977-175&quot;)
WS.verifyElementPropertyValue(response, 'ssn', &quot;900-590-289&quot;)
WS.verifyElementPropertyValue(response, 'userAgent', &quot;Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36&quot;)
WS.verifyElementPropertyValue(response, 'crypto.coin', &quot;Bitcoin&quot;)
WS.verifyElementPropertyValue(response, 'crypto.wallet', &quot;0xb9fc2fe63b2a6c003f1c324c3bfa53259162181a&quot;)
WS.verifyElementPropertyValue(response, 'crypto.network', &quot;Ethereum (ERC20)&quot;)
WS.verifyElementPropertyValue(response, 'role', &quot;admin&quot;)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
