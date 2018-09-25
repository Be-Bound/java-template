#Template

## About the source code.

This template shows the simplest app possible developed using Be-Bound tech. This app sends a request composed by one string and receives its length. 

The files directly related with Be-Bound are:

- Configuration files:
   
    - Be-App Manifest (/app/src/main/res/xml/beappmanifest.xml)
   
    - Root Gradle (/build.gradle)
   
    - App Gradle (/app/build.gradle)
    
- Java:

    - BeApp (/app/src/main/java/com/bebound/template/BeApp)

    - RequestManager (/app/src/main/java/com/bebound/template/BeApp)
 
    - RequestSendText (/app/src/main/java/com/bebound/template/request/send_text/RequestSendText)
 
    - All listeners (/app/src/main/java/com/bebound/template/request/send_text/listeners/*)

## Setting up the environment.

### Contact Be-Bound.

To develop using Be-Bound technology you need to have contacted to Be-Bound. Be-Bound will provide some mandatory data that you will need during the development. This data includes:
    
- Access to Be-Bound developer’s console: 

    - Console url.
        
    - Console user.
        
    - Console password.
    
- Access to Be-Bound developer’s tools: 
    
    - Be-Bound's maven url.
    
    - Be-Bound's maven user.
      
    - Be-Bound's maven password.
        
The email would look like the following example:
    
   ![welcome_email](/readme/welcome-email.png)

### Locate the Be-App Manifest.

You can find it (/app/src/main/res/xml/beappmanifest.xml).

![manifest](/readme/manifest.PNG)

### Create a project in Be-Bound developer's console.

- Go to console url and login yourself using the console's user and password provided in the welcome email.

![console-login](/readme/console-login.png)
   
You can fin Find the URL and the credentials here.
   
![welcome-email-console](/readme/welcome-email-console-hide.png)
   
- Create a new project.

![console-create-project](/readme/console-create-project.png)
   
- Name the project. 

The package name must be **com.bebound.template**

![console-home](/readme/console-home.png)
   
- Check your Be-App information, you will use some steps ahead.

![console-project-be-app-information](/readme/console-project-be-app-information.png)
   
- Go to Be-App Manifest tab.

![console-project-manifest](/readme/console-project-manifest.png)      

- Add a new Be-App Manifest.

![console-create-manifest-empty](/readme/console-create-manifest-empty.png)      
    
- Complete the required fields:
   
1. **Manifest** should be filled with your Be-App Manifest content (/app/src/main/res/xml/beappmanifest.xml).
        
2. **Web hook** should point to your backend.
        
3. **Web hook auth key** is the password in case you use basic auth. 
   
![console-create-manifest-filled](/readme/console-create-manifest-filled.png)
   
Once it's done, save the changes.       

### Adapting the template's source code

Once you have received the Be-Bound credentials, you should customize the template with your own data.
    
- Update you **root** build.gradle file (/build.gradle). It should look like: 
   
![android-root-build.gradle](/readme/android-root-build.gradle.png)
    
You can find your root build.gradle configuration in the welcome email. 
    
![welcome-email-root-gradle](/readme/welcome-email-root-gradle-hide.png)

- Update your **app** build.gradle file (/app/build.gradle). It should look like: 
    
![android-app-build.gradle](/readme/android-app-build.gradle.png)

You can find your app build.gradle configuration in the welcome email. 

![welcome-email-app-gradle](/readme/welcome-email-app-gradle-hide.png)

### Beyond the template. Transforming the template in a real app.

1. Change your package name;
      
- Android.
        
    Be-App Manifest (Don’t forget to update the Be-App manifest on the console and on the android app).
        
- Console. 
![console-project-be-app-information-edit](/readme/console-project-be-app-information-edit.png)
    
- Modify your Be-App Manifest to create your own new request. 
    
    Add your new request on you Be-App Manifest. For example, *example_request*. (Don’t forget to update the Be-App manifest on the console and on the android app).

    ![beyond-the-template-manifest](/readme/beyond-the-template-manifest.png)

    Inside the package request, create a package for your operation. For example, *examplerequest*.
        
    In your new package, create a new class which is in charge of managing your new request. For example, *RequestExampleRequest*.

    In the package previously created, add a new package to contains the listeners. For example, *listeners* (/app/src/com/bebound/template/*examplerequest*/*listeners*) 
        
    Create one class per listener. For example, *RequestExampleRequest*.
        
    At the end, you should have something like:
        
    ![beyond-the-template-android](/readme/beyond-the-template-android.png)

    You can find more information at [Be-Bound doc](https://doc.be-bound.com)
