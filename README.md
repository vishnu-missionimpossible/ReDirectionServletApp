# ReDirectionServletApp

redirection servlet
1. created a dynamic web project(SunMSApp) and then created a servlet of SunMSServlet. Provided the redirection link in <a></a>.
2. created a dynamic web project(OracleApp) and then created a html page called index.html
3. Add both the projects to the container. 
4. After running the application, we will see a link and on clicking, It will redirect to the OracleApp
5. In order to redirect the user directly to the OrcaleApp from SunMSapp, We will use response.sendRedirect(location) method. where location is OrcaleApp url
6. In this case, If we run our application, It will redirect to the OrcaleApp without clicking anything.

