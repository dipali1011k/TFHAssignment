# TFHAssignment
**Software Requirement**
    Appium server
    Android Studio
    Appium Inspector
    Vysor
    Eclipse(Maven,TestNG integrated)
    GitHub

**Steps to be followed**
How to connect device:
    Connect physical device by using Vysor app.
    Start appium server.
    Start appium inspector.
    Run  'adb devices' in the command prompt to show connected devices to the system.
    
**Capabilities: **  
    In appium inspector, Set Desired capabilities as,
            platformName ----- android,
            deviceName ------ android,
            app ------- path of apk file

**Steps Followed:**
    Create a new Maven project in Eclipse.
    Add dependencies to pom.xml.
    Create new packages named as baseclass and commons in src/main/java and test package in src/test/java.
    In baseclass method for downloading app in physical device is written.
    In test class Test case for login functionality is written.
    In all the classes I have used testNG annotations, such as @BeforeTest,@Test,@AfterTest.
    All the webelements are inspected using  appium inspector and clicked except EnterName as it is provided with name using .sendKeys() method.
    Insthed of using signInWithGoogle, I clicked on skip, as signInWithGoogle was showing security error.


  **How to execute:**
    Clone the remote repository using below command
    git clone  https://github.com/dipali1011k/TFHAssignment/tree/master/TFHLoginAssignment
    Import project as a Maven project in any IDE.
    Perform maven clean,install.
    Run testNG.xml as testNG Suite.

  
  
