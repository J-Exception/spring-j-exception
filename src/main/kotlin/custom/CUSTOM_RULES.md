# custom exception rules

> This exception is not made through CustomFactory, you customize the classes you want to add to the DefaultJException class.

Please make an exception for **400 HTTP STATUS in the client package** and send PR

Please make an HTTP STATUS exception for **500 times in the server package** and send PR

### Example

```kotlin

// custom
class NotFoundJJJException : JException(JErrorCode.NOT_FOUND_JJJ)
```