# spacex-api

## Checking
```
V4Client client = SpaceXClient.createV4();
boolean result = client.check();
```

## capsules
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

## company
```
V4Client client = SpaceXClient.createV4();
CompanyDto result = client.company();
```

## cores
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

## crew
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

## dragons
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

## launches
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

## launches
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

## launchpads
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

## payloads
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

## roadster
```
V4Client client = SpaceXClient.createV4();
RoadsterDto result = client.roadster();
```

## rockets
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

## ships
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

## starlink
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

## history
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