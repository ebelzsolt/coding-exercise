# Coding Exercise

## Acceptance criteria

- implement ``ExpenseOrganizerService#organize`` based on the following
    - the result map should contain the user's name and the expenditure date as key
    - the result map should contain the sum of the daily expenses per user as value
- create a class for the map's key to satisfy the criteria above
- ordering and formatting is not important

## Extra task

- when a user is not found, collect all daily expenses under the username "Other"

## Example data

### Input for the basic case

```
[
  {"userId": 1, "amount": 100, "date": "2021-01-01"},
  {"userId": 1, "amount": 200, "date": "2021-01-01"},
  {"userId": 1, "amount": 150, "date": "2021-01-02"},
  {"userId": 2, "amount": 250, "date": "2021-01-02"}
]
```

### Output for the basic case

```
{"Steve",  "2021-01-01"} -> 300
{"Steve",  "2021-01-02"} -> 150
{"George", "2021-01-02"} -> 250
```

### Input for the extra case

```
[
  {"userId": 1, "amount": 100, "date": "2021-01-01"},
  {"userId": 1, "amount": 200, "date": "2021-01-01"},
  {"userId": 1, "amount": 150, "date": "2021-01-02"},
  {"userId": 2, "amount": 250, "date": "2021-01-01"},
  {"userId": 7, "amount": 120, "date": "2021-01-03"},
  {"userId": 8, "amount": 230, "date": "2021-01-03"}
]
```

### Output for the extra case

```
{"Steve",  "2021-01-01"} -> 300
{"Steve",  "2021-01-02"} -> 150
{"George", "2021-01-02"} -> 250
{"Other",  "2021-01-03"} -> 350
```
