package demoTest;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.resources.BaseMethods;

import io.appium.java_client.remote.MobileCapabilityType;

public class MobileApplication1 extends BaseMethods {

	@Ignore
	@Test
	public void installApp() throws MalformedURLException {
		prequesities();
		cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\Hcl\\Downloads\\com.myv3ads.Napkforpc.com.apk");
		launch();
	}

	@Test
	public void launchAdsApp() throws MalformedURLException, Exception {
		prequesities();
		cap.setCapability("appPackage", "com.myv3ads");
		cap.setCapability("appActivity", "com.myv3ads.MainActivity");
		launch();
		Thread.sleep(10000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.EditText")).sendKeys("S1995na");
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.widget.EditText")).sendKeys("SNithi24");
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.TextView")).click();
	}
	@Ignore
	@Test
	public void messageApp() throws MalformedURLException, InterruptedException {
		prequesities();
		cap.setCapability("appPackage", "com.google.android.apps.messaging");
		cap.setCapability("appActivity", "com.google.android.apps.messaging.main.MainActivity");
		launch();
		
		driver.findElement(By.id("com.google.android.apps.messaging:id/welcome_fragment_federated_learning_next_button")).click();
		driver.findElement(By.id("com.google.android.apps.messaging:id/welcome_fragment_spam_next_button")).click();
		driver.findElement(By.id("com.google.android.apps.messaging:id/welcome_fragment_rcs_consent_accept_button")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.id("com.google.android.apps.messaging:id/rcs_success_msim_dismiss_button")).click();

		driver.findElement(By.xpath(
				"//android.support.v7.widget.RecyclerView[@content-desc=\"Conversation list\"]/android.view.ViewGroup[1]"))
				.click();
		for (int i = 0; i < 40 ; i++) {
			driver.findElement(By.id("com.google.android.apps.messaging:id/compose_message_text"))
					.sendKeys("Epudi... dude...");
			driver.findElement(By.id("com.google.android.apps.messaging:id/send_message_button_icon")).click();
		}
	}

}
