
:beginner: **Hibernate DDL Generation Stragegies.**

| Stragegy | Description |
| ----- | ----------- |
| create | create schema (table), data truncated |
| update | updates data in the existing table |
| create-drop | when application halts, the schema is dropped |
| validate | validate the schema, does not modify the data or structure
| none | does not do anything
