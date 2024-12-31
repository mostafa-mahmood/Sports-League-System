CREATE TABLE teams (
    team_id INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    points SMALLINT DEFAULT 0,
    captain VARCHAR(100),
    home_kit_img NVARCHAR(MAX) DEFAULT NULL,
    away_kit_img NVARCHAR(MAX) DEFAULT NULL,
    badge_img NVARCHAR(MAX) DEFAULT NULL
);

CREATE TABLE coaches (
    coach_id INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
    team_id INT NOT NULL,
    name VARCHAR(100) NOT NULL,
    nationality VARCHAR(100) NOT NULL,
    coach_img NVARCHAR(MAX) DEFAULT NULL,
    FOREIGN KEY (team_id) REFERENCES teams(team_id) ON DELETE NO ACTION
);

CREATE TABLE stadiums (
    stadium_id INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
    team_id INT NOT NULL,
    name VARCHAR(100) NOT NULL,
    location VARCHAR(100) NOT NULL,
    capacity INT NOT NULL CHECK (capacity > 0),
    std_img NVARCHAR(MAX) DEFAULT NULL,
    FOREIGN KEY (team_id) REFERENCES teams(team_id) ON DELETE NO ACTION
);

CREATE TABLE players (
    player_id INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
    team_id INT NOT NULL,
    name VARCHAR(100) NOT NULL,
    salary DECIMAL(15,2) DEFAULT 0,
    nationality VARCHAR(100) NOT NULL,
    position VARCHAR(4) CHECK (position IN ('GK', 'CB', 'LB', 'RB', 'LWB', 'RWB', 'SW', 'CM', 'DM', 'AM', 'CAM', 'CDM', 'LM', 'RM', 'ST', 'CF', 'SS', 'WG')) NOT NULL,
    shirt_number SMALLINT NOT NULL,
    player_img NVARCHAR(MAX) DEFAULT NULL,
    FOREIGN KEY (team_id) REFERENCES teams(team_id) ON DELETE NO ACTION,
    UNIQUE (team_id, shirt_number)
);

CREATE TABLE referees (
    referee_id INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    nationality VARCHAR(100) NOT NULL,
    ref_img NVARCHAR(MAX) DEFAULT NULL
);

CREATE TABLE matches (
    match_id INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
    referee_id INT NOT NULL,
    home_team_id INT NOT NULL,
    away_team_id INT NOT NULL,
    home_team_goals SMALLINT DEFAULT 0 CHECK (home_team_goals >= 0),
    away_team_goals SMALLINT DEFAULT 0 CHECK (away_team_goals >= 0),
    season VARCHAR(50) NOT NULL,
    match_date DATE NOT NULL,
    status VARCHAR(10) DEFAULT 'Pending',
    FOREIGN KEY (referee_id) REFERENCES referees(referee_id) ON DELETE NO ACTION,
    FOREIGN KEY (home_team_id) REFERENCES teams(team_id) ON DELETE NO ACTION,
    FOREIGN KEY (away_team_id) REFERENCES teams(team_id) ON DELETE NO ACTION,
    CHECK (home_team_id <> away_team_id)
);

CREATE TABLE player_match_performance (
    match_id INT NOT NULL,
    player_id INT NOT NULL,
    rating DECIMAL(3,1) DEFAULT 0 CHECK (rating >= 0 AND rating <= 10),
    minutes_played SMALLINT DEFAULT 0 CHECK (minutes_played BETWEEN 0 AND 150),
    goals SMALLINT DEFAULT 0 CHECK (goals >= 0),
    assists SMALLINT DEFAULT 0 CHECK (assists >= 0),
    yellow_cards SMALLINT DEFAULT 0 CHECK (yellow_cards >= 0 AND yellow_cards < 3),
    red_cards BIT DEFAULT 0,
    shots_on_target SMALLINT DEFAULT 0 CHECK (shots_on_target >= 0),
    passes_completed SMALLINT DEFAULT 0 CHECK (passes_completed >= 0),
    PRIMARY KEY (match_id, player_id),
    FOREIGN KEY (match_id) REFERENCES matches(match_id) ON DELETE NO ACTION,
    FOREIGN KEY (player_id) REFERENCES players(player_id) ON DELETE NO ACTION
);

CREATE TABLE player_achievements (
    name VARCHAR(100) NOT NULL UNIQUE,
    player_id INT NOT NULL,
    ach_image NVARCHAR(MAX) DEFAULT NULL,
    PRIMARY KEY (name),
    FOREIGN KEY (player_id) REFERENCES players(player_id) ON DELETE NO ACTION
);

CREATE TABLE team_achievements (
    name VARCHAR(100) NOT NULL UNIQUE,
    team_id INT NOT NULL,
    ach_image NVARCHAR(MAX) DEFAULT NULL,
    PRIMARY KEY (name),
    FOREIGN KEY (team_id) REFERENCES teams(team_id) ON DELETE NO ACTION
);

CREATE TABLE coach_achievements (
    name VARCHAR(100) NOT NULL UNIQUE,
    coach_id INT NOT NULL,
    ach_image NVARCHAR(MAX) DEFAULT NULL,
    PRIMARY KEY (name),
    FOREIGN KEY (coach_id) REFERENCES coaches(coach_id) ON DELETE NO ACTION
);

CREATE TABLE presidents (
    president_id INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
    team_id INT NOT NULL,
    name VARCHAR(100) NOT NULL,
    nationality VARCHAR(100) NOT NULL,
    pres_img NVARCHAR(MAX) DEFAULT NULL,
    FOREIGN KEY (team_id) REFERENCES teams(team_id) ON DELETE NO ACTION
);

CREATE TABLE admin (
    user_id INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
    user_name VARCHAR(25) NOT NULL UNIQUE,
    email NVARCHAR(255) NOT NULL UNIQUE,
    password NVARCHAR(MAX) NOT NULL
);
