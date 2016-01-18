<html><body>
<%! int count = 1; %>
<%! int doubleCount() {
count = count*2;
return count; }  %>
The page count is now: <%= doubleCount() %>
</body></html>