package model;

import java.sql.Date;

/**
 * Created by Peter on 12-10-2015.
 */

public class Game {
        //Creating the variables needed for the game
        private int gameId;
        private int result;
        private int newGame;
        private int endGame;
        private String name;
        private String hostControls;
        private User host;
        private User opponent;
        private String opponentControls;
        private int status;
        private Date created;
        private int mapSize;



    //Creating the constructor and initiating the variables
        public Game( int gameId, int result, String hostControls, Date created, String name, int newGame, int endGame, User host, User
        opponent, int status, int mapSize){
            this.mapSize = mapSize;
            this.gameId = gameId;
            this.result = result;
            this.created = created;
            this.hostControls = hostControls;
            this.name = name;
            this.newGame = newGame;
            this.endGame = endGame;
            this.host = host;
            this.opponent = opponent;
            this.status = status;
        }

    public Game(){}

    public int getMapSize() {
        return mapSize;
    }

    public void setMapSize(int mapSize) {
        this.mapSize = mapSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //methods that the API can use
    public int getResultForGame(){
        return result;
    }

    public void validate(){
        
    }

    //Creating get/set method for all the variables, so they can be used by other classes
    public int getGameId(){
        return gameId;
    }

    public void setGameId(int gameId){
        this.gameId = gameId;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getHostControls() {
        return hostControls;
    }

    public void setHostControls(String controls) {
        this.hostControls = controls;
    }

    public int getNewGame() {
        return newGame;
    }

    public void setNewGame(int newGame){
        this.newGame = newGame;
    }

    public int getEndGame(){
        return endGame;
    }

    public void setEndGame(int endGame){
        this.endGame = endGame;
    }

    public User getHost(){
        return host;
    }

    public void setHost(User host){
        this.host = host;
    }

    public User getOpponent(){
        return opponent;
    }

    public void setOpponent(User opponent){
        this.opponent = opponent;
    }

    public int status(){
        return status;
    }

    public void setStatus(int status){
        this.status = status;
    }

    public String getOpponentControls() {
        return opponentControls;
    }

    public void setOpponentControls(String opponentControls) {
        this.opponentControls = opponentControls;
    }
} //end of class
