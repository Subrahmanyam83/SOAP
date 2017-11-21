HOW TO CREATE A SOAP WEBSERVICE

1. Create an Interface with class annotated with @WebService and abstract methods annotated with @WebMethod
2. Create a Implementation Class, implement the methods and annotate the class with '@WebService(endpointInterface = "<psth til the Interface>")' 
3. Create a calling method PSVM - and publish the endpoint and bind it to the Implementing Class.
4. Run it.
5. Open the endpoint url 'http://localhost:9001/rv/' and addd ?wsdl to get the WSDL.
6. Save it with .wsdl extension.

HOW TO TEST THE WSDL
1. Open SOAPUI -> Create a Project and import this WSDL file.