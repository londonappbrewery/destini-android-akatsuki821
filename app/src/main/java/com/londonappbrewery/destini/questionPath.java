package com.londonappbrewery.destini;


public class questionPath {
    private int questionId;
    private int ansOneId;
    private int ansTwoId;
    private int topQuestionIndex;
    private int bottomQuestionIndex;
    public questionPath(int questionId, int topQuestionIndex, int bottomQuestionIndex, int ansOneId, int ansTwoId) {
        this.questionId = questionId;
        this.ansOneId = ansOneId;
        this.ansTwoId = ansTwoId;
        this.topQuestionIndex = topQuestionIndex;
        this.bottomQuestionIndex = bottomQuestionIndex;
    }

    public int getQuestionId() {
        return questionId;
    }

    public int getAnsOneId() {
        return ansOneId;
    }

    public int getAnsTwoId() {
        return ansTwoId;
    }

    public int getTopQuestionIndex() {
        return topQuestionIndex;
    }

    public int getBottomQuestionIndex() {
        return bottomQuestionIndex;
    }
}
