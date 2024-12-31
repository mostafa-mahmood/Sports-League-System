CREATE TABLE IF NOT EXISTS "teams" (
    "team_id" serial NOT NULL UNIQUE,
    "name" varchar(100) NOT NULL,
    "points" SMALLINT DEFAULT 0,
    "captain" varchar(100),
    "home_kit_img" TEXT DEFAULT NULL,
    "away_kit_img" TEXT DEFAULT NULL,
    "badge_img" TEXT DEFAULT NULL,
    PRIMARY KEY ("team_id")
);

CREATE TABLE IF NOT EXISTS "coaches" (
    "coach_id" serial NOT NULL UNIQUE,
    "team_id" bigint NOT NULL,
    "name" varchar(100) NOT NULL,
    "nationality" varchar(100) NOT NULL,
    "coach_img" TEXT DEFAULT NULL,
    PRIMARY KEY ("coach_id"),
    FOREIGN KEY ("team_id") REFERENCES "teams"("team_id") ON DELETE RESTRICT
);

CREATE TABLE IF NOT EXISTS "stadiums" (
    "stadium_id" serial NOT NULL UNIQUE,
    "team_id" bigint NOT NULL,
    "name" varchar(100) NOT NULL,
    "location" varchar(100) NOT NULL,
    "capacity" bigint NOT NULL CHECK (capacity > 0),
    "std_img" TEXT DEFAULT NULL,
    PRIMARY KEY ("stadium_id"),
    FOREIGN KEY ("team_id") REFERENCES "teams"("team_id") ON DELETE RESTRICT
);

CREATE TABLE IF NOT EXISTS "players" (
    "player_id" serial NOT NULL UNIQUE,
    "team_id" bigint NOT NULL,
    "name" varchar(100) NOT NULL,
    "salary" NUMERIC(15,2) DEFAULT 0,
    "nationality" varchar(100) NOT NULL,
    "position" varchar(4) CHECK ("position" IN ('GK', 'CB', 'LB', 'RB', 'LWB', 'RWB', 'SW', 'CM', 'DM', 'AM', 'CAM', 'CDM', 'LM', 'RM', 'ST', 'CF', 'SS', 'WG')) NOT NULL,
    "shirt_number" smallint NOT NULL,
    "player_img" TEXT DEFAULT NULL,
    PRIMARY KEY ("player_id"),
    FOREIGN KEY ("team_id") REFERENCES "teams"("team_id") ON DELETE RESTRICT,
    UNIQUE ("team_id", "shirt_number")
);

CREATE TABLE IF NOT EXISTS "referees" (
    "referee_id" serial NOT NULL UNIQUE,
    "name" varchar(100) NOT NULL,
    "nationality" varchar(100) NOT NULL,
    "ref_img" TEXT DEFAULT NULL,
    PRIMARY KEY ("referee_id")
);

CREATE TABLE IF NOT EXISTS "matches" (
    "match_id" serial NOT NULL UNIQUE,
    "referee_id" bigint NOT NULL,
    "home_team_id" bigint NOT NULL,
    "away_team_id" bigint NOT NULL,
    "home_team_goals" SMALLINT DEFAULT 0 CHECK ("home_team_goals" >= 0),
    "away_team_goals" SMALLINT DEFAULT 0 CHECK ("away_team_goals" >= 0),
    "season" VARCHAR(20) NOT NULL,
    "match_date" DATE NOT NULL,
    "status" VARCHAR(10) DEFAULT 'Pending',
    PRIMARY KEY ("match_id"),
    FOREIGN KEY ("referee_id") REFERENCES "referees"("referee_id") ON DELETE RESTRICT,
    FOREIGN KEY ("home_team_id") REFERENCES "teams"("team_id") ON DELETE RESTRICT,
    FOREIGN KEY ("away_team_id") REFERENCES "teams"("team_id") ON DELETE RESTRICT,
    CHECK ("home_team_id" <> "away_team_id")
);

CREATE TABLE IF NOT EXISTS "player_match_performance" (
    "match_id" bigint NOT NULL,
    "player_id" bigint NOT NULL,
    "rating" NUMERIC(3,1) DEFAULT 0 CHECK ("rating" >= 0 AND "rating" <= 10),
    "minutes_played" SMALLINT DEFAULT 0 CHECK ("minutes_played" BETWEEN 0 AND 150),
    "goals" SMALLINT DEFAULT 0 CHECK ("goals" >= 0),
    "assists" SMALLINT DEFAULT 0 CHECK ("assists" >= 0),
    "yellow_cards" SMALLINT DEFAULT 0 CHECK ("yellow_cards" >= 0 AND "yellow_cards" < 3),
    "red_cards" BOOLEAN DEFAULT FALSE,
    "shots_on_target" SMALLINT DEFAULT 0 CHECK ("shots_on_target" >= 0),
    "passes_completed" SMALLINT DEFAULT 0 CHECK ("passes_completed" >= 0),
    PRIMARY KEY ("match_id", "player_id"),
    FOREIGN KEY ("match_id") REFERENCES "matches"("match_id") ON DELETE RESTRICT,
    FOREIGN KEY ("player_id") REFERENCES "players"("player_id") ON DELETE RESTRICT
);

CREATE TABLE IF NOT EXISTS "player_achievements" (
    "name" varchar(100) NOT NULL UNIQUE,
    "player_id" bigint NOT NULL,
    "ach_image" TEXT DEFAULT NULL,
    PRIMARY KEY ("name"),
    FOREIGN KEY ("player_id") REFERENCES "players"("player_id") ON DELETE RESTRICT
);

CREATE TABLE IF NOT EXISTS "team_achievements" (
    "name" varchar(100) NOT NULL UNIQUE,
    "team_id" bigint NOT NULL,
    "ach_image" TEXT DEFAULT NULL,
    PRIMARY KEY ("name"),
    FOREIGN KEY ("team_id") REFERENCES "teams"("team_id") ON DELETE RESTRICT
);

CREATE TABLE IF NOT EXISTS "coach_achievements" (
    "name" varchar(100) NOT NULL UNIQUE,
    "coach_id" bigint NOT NULL,
    "ach_image" TEXT DEFAULT NULL,
    PRIMARY KEY ("name"),
    FOREIGN KEY ("coach_id") REFERENCES "coaches"("coach_id") ON DELETE RESTRICT
);

CREATE TABLE IF NOT EXISTS "presidents" (
    "president_id" SERIAL NOT NULL UNIQUE,
    "team_id" bigint NOT NULL,
    "name" varchar(100) NOT NULL,
    "nationality" varchar(100) NOT NULL,
    "pres_img" TEXT DEFAULT NULL,
    PRIMARY KEY("president_id"),
    FOREIGN KEY("team_id") REFERENCES "teams"("team_id") ON DELETE RESTRICT
);

CREATE TABLE IF NOT EXISTS "admin" (
    "user_id" SERIAL NOT NULL UNIQUE,
    "user_name" VARCHAR(25) NOT NULL UNIQUE,
    "email" TEXT NOT NULL UNIQUE,
    "password" TEXT NOT NULL,
    PRIMARY KEY ("user_id")
);