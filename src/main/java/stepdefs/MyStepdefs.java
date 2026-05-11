package stepdefs;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Elements.objMbhoni.*;

public class MyStepdefs {

    private void scrollAndroidByText(WebDriver driver, String skills) {
    }

    private WebDriver driver;

    public MyStepdefs() {
        this.driver = Hooks.driver;
    }

    @Given("User opens the portfolio")
    public void userOpensThePortfolio() {
        driver.get("https://mbhonichau.github.io/mbusocosby/projects.html");
    }

    @Then("Projects page gets displayed")
    public void projectsPageGetsDisplayed() {
        driver.findElement(exploreMyProjects).isDisplayed();
    }

    @When("User clicks the Home button")
    public void userClicksTheHomeButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(homePage));
        driver.findElement(homePage).click();
    }

    @Then("Welcome to my World page gets displayed")
    public void welcomeToMyWorldPageGetsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(welcomeToMyWorld).isDisplayed();
        wait.until(ExpectedConditions.visibilityOfElementLocated(welcomeToMyWorld));

    }

    @When("Member clicks About")
    public void memberClicksAbout() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(about));
        driver.findElement(about).click();
    }

    @Then("Hi there page gets displayed")
    public void hiTherePageGetsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(hiThere));
        driver.findElement(hiThere).isDisplayed();
    }

    @When("Member clicks the Read more button")
    public void memberClicksTheReadMoreButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(readMore));
        driver.findElement(readMore).click();
    }

    @Then("About Me and Quick Facts page gets displayed")
    public void aboutMeAndQuickFactsPageGetsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(quickFacts));
        driver.findElement(aboutMe).isDisplayed();
        driver.findElement(quickFacts).isDisplayed();
    }

    @When("Member scrolls down to My Skills")
    public void memberScrollsDownToMySkills() throws InterruptedException {
        Thread.sleep(5000);
        scrollAndroidByText(driver, "Skills");
    }

    @Then("multiple programming languages page gets displayed")
    public void multipleProgrammingLanguagesPageGetsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(mySkills));
        driver.findElement(mySkills).isDisplayed();
    }

    @When("Member clicks Experience")
    public void memberClicksExperience() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(experience));
        driver.findElement(experience).click();
    }

    @Then("Experience That Counts page gets displayed")
    public void experienceThatCountsPageGetsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(experienceCounts));
        driver.findElement(experienceCounts).isDisplayed();
    }


    @When("Member clicks Achievements")
    public void memberClicksAchievements() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(experienceCounts));
        driver.findElement(achievements).click();

    }

    @Then("Achievements & Awards page gets displayed")
    public void achievementsAwardsPageGetsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(experienceCounts));
        driver.findElement(achievementsAndRewards).isDisplayed();
    }

    @When("Member scrolls down to the contact section")
    public void memberScrollsDownToTheContactSection() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(experienceCounts));
        scrollAndroidByText(driver, "Contact");
    }

    @Then("Services page gets displayed")
    public void servicesPageGetsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(experienceCounts));
        driver.findElement(services).isDisplayed();
    }


    @When("Member scrolls down to Full-Stack Dev")
    public void memberScrollsDownToFullStackDev() throws InterruptedException {
        Thread.sleep(5000);
        scrollAndroidByText(driver, "Full-Stack Dev");
    }


    @Then("Full-Stack Dev and Healthcare Analytics projects get displayed")
    public void fullStackDevAndHealthcareAnalyticsProjectsGetDisplayed() {
        driver.findElement(fullStackDevDecking).isDisplayed();
        driver.findElement(fullStackDevJusaqua).isDisplayed();
    }


    @And("Member clicks the slick-next button")
    public void memberClicksTheSlickNextButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(slickNextButton));
        driver.findElement(slickNextButton).click();

    }

    @Then("Climate Analytics project get displayed")
    public void climateAnalyticsProjectGetDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(climate));
        driver.findElement(climate).isDisplayed();

    }

    @Then("Predictive Analytics project get displayed")
    public void predictiveAnalyticsProjectGetDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(predictiveAnalytics));
        driver.findElement(predictiveAnalytics).isDisplayed();

    }

    @Then("AI-Based Learning project get displayed")
    public void aiBasedLearningProjectGetDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(aiBasedLearning));
        driver.findElement(aiBasedLearning).isDisplayed();

    }

    @Then("Economic Modeling project get displayed")
    public void economicModelingProjectGetDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(economicModelling));
        driver.findElement(economicModelling).isDisplayed();

    }

    @Then("Machine Learning project get displayed")
    public void machineLearningProjectGetDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(machineLearning));
        driver.findElement(machineLearning).isDisplayed();

    }

    @Then("Sustainability project get displayed")
    public void sustainabilityProjectGetDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(sustainability));
        driver.findElement(sustainability).isDisplayed();

    }
}
