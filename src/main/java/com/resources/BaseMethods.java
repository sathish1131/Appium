package com.resources;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseMethods {
	public DesiredCapabilities cap;
	public URL url;
	public AndroidDriver driver;
	public void prequesities() throws MalformedURLException {
		cap = new DesiredCapabilities();

		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
		cap.setCapability(MobileCapabilityType.UDID, "RZ8RA0BYMFW");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");

	}
	public void launch() throws MalformedURLException {
		url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
