//
//
//
//@BeforeClass
//public void classInit() throws URISyntaxException, MalformedURLException {
//        URL testAppUrl = getClass().getClassLoader().getResource("TestApp.app.zip");
//        File testAppFile = Paths.get(Objects.requireNonNull(testAppUrl).toURI()).toFile();
//        String testAppPath = testAppFile.getAbsolutePath();
//        var desiredCaps = new DesiredCapabilities();
//        desiredCaps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 12 Pro Max");
//        desiredCaps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
//        desiredCaps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.4");
//        desiredCaps.setCapability(MobileCapabilityType.APP, testAppPath);
//        driver = new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCaps);
//        driver.closeApp();
//        }
//@BeforeMethod
//public void testInit() {
//        if (driver != null) {
//        driver.launchApp();
//        }
//        }
//@AfterMethod
//public void testCleanup() {
//        if (driver != null) {
//        driver.closeApp();
//        }
//        }
