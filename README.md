# API - Purchase & Details
 
## How to use the API
* First, you can see how the API returns the JSON with the <a href="https://www.postman.com/"> postman</a>;
* Search for all valid purchases (valid purchases are those that are not expired): http://localhost:8080/api/purchase;
```json
[
    {
        "id": 1,
        "version": 0,
        "creationTime": "2022-10-22T13:44:49.710+00:00",
        "updateTime": "2022-10-22T13:44:49.710+00:00",
        "productType": "Toothpaste",
        "expires": "2022-10-22T13:44:49.710+00:00",
        "purchaseDetails": {
            "id": 1,
            "version": 0,
            "creationTime": "2022-10-22T13:44:49.707+00:00",
            "updateTime": "2022-10-22T13:44:49.707+00:00",
            "description": "The perfect size to ...",
            "quantity": 1,
            "price": 30.3
        }
    },
    {
        "id": 2,
        "version": 0,
        "creationTime": "2022-10-22T13:44:49.712+00:00",
        "updateTime": "2022-10-22T13:44:49.712+00:00",
        "productType": "Vitamins",
        "expires": "2022-11-11T13:44:49.712+00:00",
        "purchaseDetails": {
            "id": 2,
            "version": 0,
            "creationTime": "2022-10-22T13:44:49.709+00:00",
            "updateTime": "2022-10-22T13:44:49.709+00:00",
            "description": "The duration  is ...",
            "quantity": 3,
            "price": 76.1
        }
    }
] 
```
* Store your purchase with your details: http://localhost:8080/api/purchase/add.
```json
{
    "productType": "Beverages",
    "expires": "2023-10-30T11:36:06.977+00:00",
    "purchaseDetails": {
        "description": "Soft and fruity wine. Pleasant aroma and well-balanced in the mouth",
        "quantity": 2,
        "price": 48.30
    }
}
```


## You can use Database H2 for test
* http://localhost:8080/h2-console/.

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

### Suport
My contacts here: 
[Linkedin](https://www.linkedin.com/in/deviniciuss/)
