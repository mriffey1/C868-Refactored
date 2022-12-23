# C868 Capstone Refactor Project</br>
## **12/23/2022** </br>
Further reduced # of lines for changing scene's
<hr>

## **10/17/2022** </br>
Consolidated and eliminated code for changing scene's. Created a helper (helper/SceneChange) file to house the code in a centralized location and created an object in each approrpriate controller class. This process eliminated roughly 100 lines of duplicate code. 
</br>
###### Object Created: </br>
> SceneChange sceneChange = new SceneChange();
<hr>
