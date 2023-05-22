
Selenium-Project
=======================

Running from Eclipse:

1.Import Maven project
2.Go to SignUpTestsIT.java and Execute it as TestNG test
3.Please update the pom to make it run as default browser to chrome 

Troubleshooting errors:
In case chromedriver path is not identified , add chromedriver path in pom.xml <webdriver.chrome.driver>
Browser version can cause test to fail please make sure browser version and chromedriver is in sync , binaries can be found over here /selenium/src/test/resources/selenium_standalone_binaries

Test Reports can be viewed here with logs embedded in the report:
/selenium/test-output/emailable-report.html

Running from cmd:
1. Open a terminal window/command prompt
2. Clone this project.
3. `cd selenium` (Or whatever folder you cloned it into)
4. `mvn clean verify -Dwebdriver.chrome.driver=<full path to chromedriver>/selenium/src/test/resources/selenium_standalone_binaries/osx/googlechrome/64bit/chromedriver`

All dependencies should now be downloaded and the test will have run on chrome browser (Assuming you have chrome installed in the default location)


### Anything else?

Yes you can specify which browser to use by using one of the following switches:

- -Dbrowser=firefox
- -Dbrowser=chrome
- -Dbrowser=ie
- -Dbrowser=edge
- -Dbrowser=opera

If you want to toggle the use of chrome or firefox in headless mode set the headless flag (by default the headless flag is set to true)

- -Dheadless=true
- -Dheadless=false

You don't need to worry about downloading the IEDriverServer, EdgeDriver, ChromeDriver , OperaChromiumDriver, or GeckoDriver binaries, this project will do that for you automatically.

You can specify a grid to connect to where you can choose your browser, browser version and platform:

- -Dremote=true 
- -DseleniumGridURL=http://{username}:{accessKey}@ondemand.saucelabs.com:80/wd/hub 
- -Dplatform=xp 
- -Dbrowser=firefox 
- -DbrowserVersion=44

You can even specify multiple threads (you can do it on a grid as well!):

- -Dthreads=2

You can also specify a proxy to use

- -DproxyEnabled=true
- -DproxyHost=localhost
- -DproxyPort=8080
- -DproxyUsername=fred
- -DproxyPassword=Password123

If the tests fail screenshots will be saved in ${project.basedir}/target/screenshots

If you need to force a binary overwrite you can do:

- -Doverwrite.binaries=true

### It's not working!!!

You have probably got outdated driver binaries, by default they are not overwritten if they already exist to speed things up.  You have two options:

- `mvn clean verify -Doverwrite.binaries=true`
- Delete the `selenium_standalone_binaries` folder in your resources directory