start "account-service" cmd /k "cd ""account-service"" & mvnw.cmd clean install"
start "customer-service" cmd /k "cd ""customer-service"" & mvnw.cmd clean install"
start "discovery-service" cmd /k "cd ""discovery-service"" & mvnw.cmd clean install"
start "gateway-service" cmd /k "cd ""gateway-service"" & mvnw.cmd clean install"