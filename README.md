# NFL Stats Data Library

Java JPA Library for Working with the NFL Statistics Database.

## Codes

There are four classes that handle classification codes in the database. These are as follows:

* __PositionCode__ - Identifies the primary position for the player.
* __StatisticCategory__ - Identifies the category of the statistic value. Offensive, Defensive and Special Teams are the main categories.
* __StatisticCode__ - Identifies the type of statistic. Examples include yards, completions, attempts, rushing yards, etc.
* __TypeCode__ - Identifies the Schedule Type for a game. Preseason, Regular Season and Post Season are the main values.

## Main Data Objects

The main data being collected is stored in these objects:

* __Player__ - Identifies a player participating in a game.
* __Schedule__ - Instance of a game that has been played.
* __Statistic__- Statistical value from a game performed by either a player or a team.
