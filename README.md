# vuelo


# GET http://localhost:443/rappi/vuelo/v1/tiquets/

## Respose
´´
[
    {
        "itineraryid": 1,
        "name": "Cesar Anguiano",
        "departureDate": "2021-05-10",
        "arrivalDate": "2021-05-10",
        "cityOrigin": "CDMX",
        "cityDestination": "GDL",
        "baggage": false,
        "cost": 125.5,
        "departureHour": "12:22:00",
        "arrivalHour": "16:22:00"
    },
    {
        "itineraryid": 2,
        "name": "Pedro Infante",
        "departureDate": "2021-05-10",
        "arrivalDate": "2021-05-10",
        "cityOrigin": "CDMX",
        "cityDestination": "GDL",
        "baggage": true,
        "cost": 125.5,
        "departureHour": "12:22:00",
        "arrivalHour": "16:22:00"
    },
    {
        "itineraryid": 3,
        "name": "Pedro Paramo",
        "departureDate": "2021-05-10",
        "arrivalDate": "2021-05-10",
        "cityOrigin": "CDMX",
        "cityDestination": "GDL",
        "baggage": false,
        "cost": 125.5,
        "departureHour": "12:22:00",
        "arrivalHour": "16:22:00"
    }
]
´´

# GET http://localhost:443/rappi/vuelo/v1/tiquets/{id}

## Respose
{
    "itineraryid": 1,
    "name": "Cesar Anguiano",
    "departureDate": "2021-05-10",
    "arrivalDate": "2021-05-10",
    "cityOrigin": "CDMX",
    "cityDestination": "GDL",
    "baggage": false,
    "cost": 125.5,
    "departureHour": "12:22:00",
    "arrivalHour": "16:22:00"
}

# POST http://localhost:443/rappi/vuelo/v1/tiquets/

## Request
{
    "name": "Pedro Paramo",
    "departureDate": "2021-05-11",
    "arrivalDate": "2021-05-11",
    "cityOrigin": "CDMX",
    "cityDestination": "GDL",
    "baggage": false,
    "cost": 125.5,
    "departureHour": "12:22:00",
    "arrivalHour": "16:22:00"
}

## Respose
{
    "message": "Se agrego correctamente tu vuelo",
    "vuelo": {
        "itineraryid": 3,
        "name": "Pedro Paramo",
        "departureDate": "2021-05-10",
        "arrivalDate": "2021-05-10",
        "cityOrigin": "CDMX",
        "cityDestination": "GDL",
        "baggage": false,
        "cost": 125.5,
        "departureHour": "12:22:00",
        "arrivalHour": "16:22:00"
    }
}
