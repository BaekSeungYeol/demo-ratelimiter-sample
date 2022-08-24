**1. localhost:8080/test1**
- Add 1s CircuitBreaker timeLimiter filter 
- it took 2 seconds, it goes to the default fallback.
- it worked

**Request**
```
curl localhost:8080/test1
```

**Response**
```
default Fallback
```

<br>
<br>
<br>

**2. localhost:8080/test2**
- Add Only one request in 60 seconds CircuitBreaker rateLimiter filter 
- No error occurred despite sending more than 2 requests
- it doesn't work


**Request**
```
curl localhost:8080/test2
curl localhost:8080/test2
```

**Response**
```
test rate limit
test rate limit
```
