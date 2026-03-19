# videoclubJava

# Objective
This is a proyect to the bootcamp P1InditexOnce, where we are learning to work mixing 
the external DB with a webSite.

# Resources
To this proyect, we must use a groupal proyect that we have done with some companions, 
but with java vanilla this time.

# structure of proyect:

src
|
|-org.example
| |
| |
| |-config
| ||-DBManager.java(The class that allow use the external DB)
| |
| |-controller
| ||-MovieController.java(who is the intermediary between the parts of the app)
| |
| |-model
| ||-Movie.java(The entitiy of the app)
| |
| |-RepositoryImp.java(the class who pass the data to a DDBB)
| |
| |-View
| ||-MovieView.java(the one who azsk the data in console to the user of the app)
| |
| ||-main.java(the class that allow you run the app)