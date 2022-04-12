# spacex-api

## Checking
```
V4Client client = SpaceXClient.createV4();
boolean result = client.check();
```

## Capsules
Detailed info for serialized dragon capsules.
### all
```
V4Client client = SpaceXClient.createV4();
List<CapsuleDto> result = client.capsules();
```
### one
```
V4Client client = SpaceXClient.createV4();
String id = // some id
List<CapsuleDto> result = client.capsules(id);
```

## Company
Detailed info about SpaceX as a company.
```
V4Client client = SpaceXClient.createV4();
CompanyDto result = client.company();
```

## Cores
Detailed info for serialized first stage cores.
### all
```
V4Client client = SpaceXClient.createV4();
List<CoreDto> result = client.cores();
```
### one
```
V4Client client = SpaceXClient.createV4();
String id = // some id
CoreDto result = client.cores(id);
```

## Crew
Detailed info on dragon crew members.
### all
```
V4Client client = SpaceXClient.createV4();
List<CrewDto> result = client.crew();
```
### one
```
V4Client client = SpaceXClient.createV4();
String id = // some id
CrewDto result = client.crew(id);
```

## Dragons
Detailed info about dragon capsule versions.
### all
```
V4Client client = SpaceXClient.createV4();
List<DragonDto> result = client.dragons();
```
### one
```
V4Client client = SpaceXClient.createV4();
String id = // some id
DragonDto result = client.dragons(id);
```

## Launches
Detailed info about landing pads and ships.
### all
```
V4Client client = SpaceXClient.createV4();
List<LandpadDto> result = client.landpads();
```
### one
```
V4Client client = SpaceXClient.createV4();
String id = // some id
LandpadDto result = client.landpads(id);
```

## Launches
Detailed info about launches.
### all
```
V4Client client = SpaceXClient.createV4();
List<LaunchDto> result = client.launches();
```
### one
```
V4Client client = SpaceXClient.createV4();
String id = // some id
LaunchDto result = client.launches(id);
```

## Launchpads
Detailed info about launchpads.
### all
```
V4Client client = SpaceXClient.createV4();
List<LaunchpadDto> result = client.launchpads();
```
### one
```
V4Client client = SpaceXClient.createV4();
String id = // some id
LaunchpadDto result = client.launchpads(id);
```

## Payloads
Detailed info about launch payloads.
### all
```
V4Client client = SpaceXClient.createV4();
List<PayloadDto> result = client.payloads();
```
### one
```
V4Client client = SpaceXClient.createV4();
String id = // some id
PayloadDto result = client.payloads(id);
```

## Roadster
Detailed info about Elon's Tesla roadster's current position.
```
V4Client client = SpaceXClient.createV4();
RoadsterDto result = client.roadster();
```

## Rockets
Detailed info about rocket versions.
### all
```
V4Client client = SpaceXClient.createV4();
List<RocketDto> result = client.rockets();
```
### one
```
V4Client client = SpaceXClient.createV4();
String id = // some id
RocketDto result = client.rockets(id);
```

## Ships
Detailed info about ships in the SpaceX fleet.
### all
```
V4Client client = SpaceXClient.createV4();
List<ShipDto> result = client.ships();
```
### one
```
V4Client client = SpaceXClient.createV4();
String id = // some id
ShipDto result = client.ships(id);
```

## Starlink
Detailed info about Starlink satellites and orbits.
### all
```
V4Client client = SpaceXClient.createV4();
List<StarlinkDto> result = client.starlink();
```
### one
```
V4Client client = SpaceXClient.createV4();
String id = // some id
StarlinkDto result = client.starlink(id);
```

## History
Detailed info on SpaceX historical events.
### all
```
V4Client client = SpaceXClient.createV4();
List<HistoryDto> result = client.history();
```
### one
```
V4Client client = SpaceXClient.createV4();
String id = // some id
HistoryDto result = client.history(id);
```