# user_feature

H2 db connection
link --> localhost:8080/h2-console
password: password

API example:
GET http://localhost:8080/feature?email=test_true@gmail.com&featureName=testTrue

POST http://localhost:8080/feature
{
	"featureName": "testTrue",
	"email": "test_true@gmail.com",
	"enable": true
}
