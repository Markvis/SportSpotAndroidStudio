package com.asuscomm.geniusware.com.sportspot;public class NBATeam {

  private String teamName;

  private int gamesPlayed;
  private float minutes;
  private int fieldGoalsMade;
  private int fieldGoalsAtt;
  private int threePointsMade;
  private int threePointsAtt;
  private int blockedAtt;
  private int freeThrowsMade;
  private int freeThrowsAtt;
  private int offensiveRebounds;
  private int defensiveRebounds;
  private int assists;
  private int turnovers;
  private int steals;
  private int blocks;
  private int personalFouls;
  private int techFouls;
  private int points;
  private int fastBreakPoints;
  private int paintPts;
  private int flagrantFouls;
  private int pointsOffTurnovers;
  private int secondChancePoints;
  private float freeThrowsPct;
  private float twoPointsPct;
  private float threePointsPct;
  private float fieldGoalsPct;
  private int rebounds;
  private float assistsTurnoverRatio;
  private int twoPointsMade;
  private int twoPointsAtt;

  public NBATeam() {
    teamName = "";
    gamesPlayed = 0;
    minutes = 0;
    fieldGoalsMade = 0;
    fieldGoalsAtt = 0;
    threePointsMade = 0;
    threePointsAtt = 0;
    blockedAtt = 0;
    freeThrowsMade = 0;
    freeThrowsAtt = 0;
    offensiveRebounds = 0;
    defensiveRebounds = 0;
    assists = 0;
    turnovers = 0;
    steals = 0;
    blocks = 0;
    personalFouls = 0;
    techFouls = 0;
    points = 0;
    fastBreakPoints = 0;
    paintPts = 0;
    flagrantFouls = 0;
    pointsOffTurnovers = 0;
    secondChancePoints = 0;
    freeThrowsPct = 0;
    twoPointsPct = 0;
    threePointsPct = 0;
    fieldGoalsPct = 0;
    rebounds = 0;
    assistsTurnoverRatio = 0;
    twoPointsMade = 0;
    twoPointsAtt = 0;
  }

  public NBATeam(String teamName, int gamesPlayed, float minutes, int fieldGoalsMade, int fieldGoalsAtt, int threePointsMade, 
  int threePointsAtt, int blockedAtt, int freeThrowsMade, int freeThrowsAtt, int offensiveRebounds, 
  int defensiveRebounds, int assists, int turnovers, int steals, int blocks, int personalFouls, 
  int techFouls, int points, int fastBreakPoints, int paintPts, int flagrantFouls, int pointsOffTurnovers, 
  int secondChancePoints, float freeThrowsPct, float twoPointsPct, float threePointsPct, float fieldGoalsPct, 
  int rebounds, float assistsTurnoverRatio, int twoPointsMade, int twoPointsAtt) {

    this.teamName = teamName;
    this.gamesPlayed = gamesPlayed;
    this.minutes = minutes;
    this.fieldGoalsMade = fieldGoalsMade;
    this.fieldGoalsAtt = fieldGoalsAtt;
    this.threePointsMade = threePointsMade;
    this.threePointsAtt = threePointsAtt;
    this.blockedAtt = blockedAtt;
    this.freeThrowsMade = freeThrowsMade;
    this.freeThrowsAtt = freeThrowsAtt;
    this.offensiveRebounds = offensiveRebounds;
    this.defensiveRebounds = defensiveRebounds;
    this.assists = assists;
    this.turnovers = turnovers;
    this.steals = steals;
    this.blocks = blocks;
    this.personalFouls = personalFouls;
    this.techFouls = techFouls;
    this.points = points;
    this.fastBreakPoints = fastBreakPoints;
    this.paintPts = paintPts;
    this.flagrantFouls = flagrantFouls;
    this.pointsOffTurnovers = pointsOffTurnovers;
    this.secondChancePoints = secondChancePoints;
    this.freeThrowsPct = freeThrowsPct;
    this.twoPointsPct = twoPointsPct;
    this.threePointsPct = threePointsPct;
    this.fieldGoalsPct = fieldGoalsPct;
    this.rebounds = rebounds;
    this.assistsTurnoverRatio = assistsTurnoverRatio;
    this.twoPointsMade = twoPointsMade;
    this.twoPointsAtt = twoPointsAtt;
  }

  /**
   * @return the teamName
   */
  public String getTeamName() {
    return teamName;
  }

  /**
   * @param teamName the teamName to set
   */
  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }

  /**
   * @return the gamesPlayed
   */
  public int getGamesPlayed() {
    return gamesPlayed;
  }

  /**
   * @param gamesPlayed the gamesPlayed to set
   */
  public void setGamesPlayed(int gamesPlayed) {
    this.gamesPlayed = gamesPlayed;
  }

  /**
   * @return the minutes
   */
  public float getMinutes() {
    return minutes;
  }

  /**
   * @param minutes the minutes to set
   */
  public void setMinutes(float minutes) {
    this.minutes = minutes;
  }

  /**
   * @return the fieldGoalsMade
   */
  public int getFieldGoalsMade() {
    return fieldGoalsMade;
  }

  /**
   * @param fieldGoalsMade the fieldGoalsMade to set
   */
  public void setFieldGoalsMade(int fieldGoalsMade) {
    this.fieldGoalsMade = fieldGoalsMade;
  }

  /**
   * @return the fieldGoalsAtt
   */
  public int getFieldGoalsAtt() {
    return fieldGoalsAtt;
  }

  /**
   * @param fieldGoalsAtt the fieldGoalsAtt to set
   */
  public void setFieldGoalsAtt(int fieldGoalsAtt) {
    this.fieldGoalsAtt = fieldGoalsAtt;
  }

  /**
   * @return the threePointsMade
   */
  public int getThreePointsMade() {
    return threePointsMade;
  }

  /**
   * @param threePointsMade the threePointsMade to set
   */
  public void setThreePointsMade(int threePointsMade) {
    this.threePointsMade = threePointsMade;
  }

  /**
   * @return the threePointsAtt
   */
  public int getThreePointsAtt() {
    return threePointsAtt;
  }

  /**
   * @param threePointsAtt the threePointsAtt to set
   */
  public void setThreePointsAtt(int threePointsAtt) {
    this.threePointsAtt = threePointsAtt;
  }

  /**
   * @return the blockedAtt
   */
  public int getBlockedAtt() {
    return blockedAtt;
  }

  /**
   * @param blockedAtt the blockedAtt to set
   */
  public void setBlockedAtt(int blockedAtt) {
    this.blockedAtt = blockedAtt;
  }

  /**
   * @return the freeThrowsMade
   */
  public int getFreeThrowsMade() {
    return freeThrowsMade;
  }

  /**
   * @param freeThrowsMade the freeThrowsMade to set
   */
  public void setFreeThrowsMade(int freeThrowsMade) {
    this.freeThrowsMade = freeThrowsMade;
  }

  /**
   * @return the freeThrowsAtt
   */
  public int getFreeThrowsAtt() {
    return freeThrowsAtt;
  }

  /**
   * @param freeThrowsAtt the freeThrowsAtt to set
   */
  public void setFreeThrowsAtt(int freeThrowsAtt) {
    this.freeThrowsAtt = freeThrowsAtt;
  }

  /**
   * @return the offensiveRebounds
   */
  public int getOffensiveRebounds() {
    return offensiveRebounds;
  }

  /**
   * @param offensiveRebounds the offensiveRebounds to set
   */
  public void setOffensiveRebounds(int offensiveRebounds) {
    this.offensiveRebounds = offensiveRebounds;
  }

  /**
   * @return the defensiveRebounds
   */
  public int getDefensiveRebounds() {
    return defensiveRebounds;
  }

  /**
   * @param defensiveRebounds the defensiveRebounds to set
   */
  public void setDefensiveRebounds(int defensiveRebounds) {
    this.defensiveRebounds = defensiveRebounds;
  }

  /**
   * @return the assists
   */
  public int getAssists() {
    return assists;
  }

  /**
   * @param assists the assists to set
   */
  public void setAssists(int assists) {
    this.assists = assists;
  }

  /**
   * @return the turnovers
   */
  public int getTurnovers() {
    return turnovers;
  }

  /**
   * @param turnovers the turnovers to set
   */
  public void setTurnovers(int turnovers) {
    this.turnovers = turnovers;
  }

  /**
   * @return the steals
   */
  public int getSteals() {
    return steals;
  }

  /**
   * @param steals the steals to set
   */
  public void setSteals(int steals) {
    this.steals = steals;
  }

  /**
   * @return the blocks
   */
  public int getBlocks() {
    return blocks;
  }

  /**
   * @param blocks the blocks to set
   */
  public void setBlocks(int blocks) {
    this.blocks = blocks;
  }

  /**
   * @return the personalFouls
   */
  public int getPersonalFouls() {
    return personalFouls;
  }

  /**
   * @param personalFouls the personalFouls to set
   */
  public void setPersonalFouls(int personalFouls) {
    this.personalFouls = personalFouls;
  }

  /**
   * @return the techFouls
   */
  public int getTechFouls() {
    return techFouls;
  }

  /**
   * @param techFouls the techFouls to set
   */
  public void setTechFouls(int techFouls) {
    this.techFouls = techFouls;
  }

  /**
   * @return the points
   */
  public int getPoints() {
    return points;
  }

  /**
   * @param points the points to set
   */
  public void setPoints(int points) {
    this.points = points;
  }

  /**
   * @return the fastBreakPoints
   */
  public int getFastBreakPoints() {
    return fastBreakPoints;
  }

  /**
   * @param fastBreakPoints the fastBreakPoints to set
   */
  public void setFastBreakPoints(int fastBreakPoints) {
    this.fastBreakPoints = fastBreakPoints;
  }

  /**
   * @return the paintPts
   */
  public int getPaintPts() {
    return paintPts;
  }

  /**
   * @param paintPts the paintPts to set
   */
  public void setPaintPts(int paintPts) {
    this.paintPts = paintPts;
  }

  /**
   * @return the flagrantFouls
   */
  public int getFlagrantFouls() {
    return flagrantFouls;
  }

  /**
   * @param flagrantFouls the flagrantFouls to set
   */
  public void setFlagrantFouls(int flagrantFouls) {
    this.flagrantFouls = flagrantFouls;
  }

  /**
   * @return the pointsOffTurnovers
   */
  public int getPointsOffTurnovers() {
    return pointsOffTurnovers;
  }

  /**
   * @param pointsOffTurnovers the pointsOffTurnovers to set
   */
  public void setPointsOffTurnovers(int pointsOffTurnovers) {
    this.pointsOffTurnovers = pointsOffTurnovers;
  }

  /**
   * @return the secondChancePoints
   */
  public int getSecondChancePoints() {
    return secondChancePoints;
  }

  /**
   * @param secondChancePoints the secondChancePoints to set
   */
  public void setSecondChancePoints(int secondChancePoints) {
    this.secondChancePoints = secondChancePoints;
  }

  /**
   * @return the freeThrowsPct
   */
  public float getFreeThrowsPct() {
    return freeThrowsPct;
  }

  /**
   * @param freeThrowsPct the freeThrowsPct to set
   */
  public void setFreeThrowsPct(float freeThrowsPct) {
    this.freeThrowsPct = freeThrowsPct;
  }

  /**
   * @return the twoPointsPct
   */
  public float getTwoPointsPct() {
    return twoPointsPct;
  }

  /**
   * @param twoPointsPct the twoPointsPct to set
   */
  public void setTwoPointsPct(float twoPointsPct) {
    this.twoPointsPct = twoPointsPct;
  }

  /**
   * @return the threePointsPct
   */
  public float getThreePointsPct() {
    return threePointsPct;
  }

  /**
   * @param threePointsPct the threePointsPct to set
   */
  public void setThreePointsPct(float threePointsPct) {
    this.threePointsPct = threePointsPct;
  }

  /**
   * @return the fieldGoalsPct
   */
  public float getFieldGoalsPct() {
    return fieldGoalsPct;
  }

  /**
   * @param fieldGoalsPct the fieldGoalsPct to set
   */
  public void setFieldGoalsPct(float fieldGoalsPct) {
    this.fieldGoalsPct = fieldGoalsPct;
  }

  /**
   * @return the Rebounds
   */
  public int getRebounds() {
    return rebounds;
  }

  /**
   * @param Rebounds the Rebounds to set
   */
  public void setRebounds(int rebounds) {
    this.rebounds = rebounds;
  }

  /**
   * @return the assistsTurnoverRatio
   */
  public float getAssistsTurnoverRatio() {
    return assistsTurnoverRatio;
  }

  /**
   * @param assistsTurnoverRatio the assistsTurnoverRatio to set
   */
  public void setAssistsTurnoverRatio(float assistsTurnoverRatio) {
    this.assistsTurnoverRatio = assistsTurnoverRatio;
  }

  /**
   * @return the twoPointsMade
   */
  public int getTwoPointsMade() {
    return twoPointsMade;
  }

  /**
   * @param twoPointsMade the twoPointsMade to set
   */
  public void setTwoPointsMade(int twoPointsMade) {
    this.twoPointsMade = twoPointsMade;
  }

  /**
   * @return the twoPointsAtt
   */
  public int getTwoPointsAtt() {
    return twoPointsAtt;
  }

  /**
   * @param twoPointsAtt the twoPointsAtt to set
   */
  public void setTwoPointsAtt(int twoPointsAtt) {
    this.twoPointsAtt = twoPointsAtt;
  }

  @Override 
  public String toString() {

    String result = "***" + teamName + "***\n";
    result += "Games Played: " + Integer.toString(gamesPlayed) + "\n";
    result += "Minutes: " + Float.toString(minutes) + "\n";
    result += "Field Goals Made: " + Integer.toString(fieldGoalsMade) + "\n";
    result += "fieldGoals Attempted: " + Integer.toString(fieldGoalsAtt) + "\n";
    result += "Three Points Made: " + Integer.toString(threePointsMade) + "\n";
    result += "Three Points Attempted: " + Integer.toString(threePointsAtt) + "\n";
    result += "Blocked Attempted: " + Integer.toString(blockedAtt) + "\n";
    result += "Free Throws Made: " + Integer.toString(freeThrowsMade) + "\n";
    result += "Free Throws Attempted: " + Integer.toString(freeThrowsAtt) + "\n";
    result += "Offensive Rebounds: " + Integer.toString(offensiveRebounds) + "\n";
    result += "Defensive Rebounds: " + Integer.toString(defensiveRebounds) + "\n";
    result += "Assists: " + Integer.toString(assists) + "\n";
    result += "Turnovers: " + Integer.toString(turnovers) + "\n";
    result += "Steals: " + Integer.toString(steals) + "\n";
    result += "Blocks: " + Integer.toString(blocks) + "\n";
    result += "Personal Fouls: " + Integer.toString(personalFouls) + "\n";
    result += "Technical Fouls: " + Integer.toString(techFouls) + "\n";
    result += "Points: " + Integer.toString(points) + "\n";
    result += "Fast Break Points: " + Integer.toString(fastBreakPoints) + "\n";
    result += "Paint Points: " + Integer.toString(paintPts) + "\n";
    result += "Flagrant Fouls: " + Integer.toString(flagrantFouls) + "\n";
    result += "Points Off Turnovers: " + Integer.toString(pointsOffTurnovers) + "\n";
    result += "Second Chance Points: " + Integer.toString(secondChancePoints) + "\n";
    result += "Free Throw Percentage: " + Float.toString(freeThrowsPct) + "\n";
    result += "Two Points Percentage: " + Float.toString(twoPointsPct) + "\n";
    result += "Three Points Percentage: " + Float.toString(threePointsPct) + "\n";
    result += "Field Goals Percentage: " + Float.toString(fieldGoalsPct) + "\n";
    result += "Rebounds: " + Integer.toString(rebounds) + "\n";
    result += "Assists Turnover Ratio: " + Float.toString(assistsTurnoverRatio) + "\n";
    result += "Two Points Made: " + Integer.toString(twoPointsMade) + "\n";
    result += "Two Points Attempted: " + Integer.toString(twoPointsAtt) + "\n";

    return result;
  }
}

