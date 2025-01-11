class QuestionsService {
    Questions questions[]= new Questions[5];

    QuestionsService()
    {
        questions[0]= new Questions(1, "What","Java","C++","Python","C","Java");
    }

    public void displayQuestions()
    {
        for(Questions q : questions)
        {
            System.out.println(q);
        }
        
    }
    
}