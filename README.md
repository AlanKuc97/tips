# Versions
Java: 11 

Spring Boot: 2.7.1


Program will return amount of kcal you need every day for trip, stops for sleep,
approximate duration of trip and optional things.

Request body example (weather can be 2 tipes: COLD or HOT):
```
{
	"km": 600,
	"weightKg":50,
	"yearsOld":25,
	"avgSpeed":5,
	"heightCm":190,
	"weather":"COLD"
}
```
