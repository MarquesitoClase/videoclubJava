# videoclubJava

# Objective
This is a project to the bootcamp P1InditexOnce, where we are learning to work mixing 
the external DB with a webSite.

# Resources
To this project, we must use a group project that we have done with some companions, 
but do it with java vanilla this time.

# structure of project:

src  
|  
|-org.example  
| |  
| |  
| |-config  
| |  |-DBManager.java(The class that allow use the external DB)  
| |  
| |-controller  
| |  |-MovieController.java(who is the intermediary between the parts of the app)  
| |  
| |-model  
| |  |-Movie.java(The entity of the app)  
| |  
| |-RepositoryImp.java(the class who pass the data to a DDBB)  
| |  
| |-View  
| |  |-MovieView.java(the one who ask the data in console to the user of the app)  
| |  
|-main.java(the class that allow you run the app)  