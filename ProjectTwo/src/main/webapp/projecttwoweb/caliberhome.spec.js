
describe('Caliber homepage check elements', function() {
  beforeEach(function() {
    browser.driver.manage().window().maximize();
    browser.get('http://dev-caliber.revature.tech/caliber/#/routing/');
  });
  describe('Caliber homepage nodes', function() {
    it('should check all elements are present and clickable ', function() {
      expect(browser.getTitle()).toEqual('Caliber | Performance Management')
      expect(element(by.linkText('user guide')).getTagName()).toBe('a');
      expect(browser.getTitle()).toBe('Caliber | Performance Management');
      element(by.css("html > body > div > ui-view > nav > div > ul:nth-of-type(2) > li:nth-of-type(1) > a")).click();
      expect(element(by.css("html > body > div > ui-view > nav > div > ul:nth-of-type(1) > li > a")).isPresent()).toBe(true);
      expect(element(by.css("html > body > div > ui-view > nav > div > ul:nth-of-type(2) > li:nth-of-type(1) > a")).isPresent()).toBe(true);
      expect(element(by.css("html > body > div > ui-view > nav > div > ul:nth-of-type(2) > li:nth-of-type(3) > a")).isPresent()).toBe(true);
      expect(element(by.css("html > body > div > ui-view > nav > div > ul:nth-of-type(2) > li:nth-of-type(2) > a")).isPresent()).toBe(true);
      expect(element(by.css("html > body > div > ui-view > nav > div > ul:nth-of-type(2) > li:nth-of-type(4) > a")).isPresent()).toBe(true);
      expect(element(by.css("html > body > div > ui-view > ui-view > div:nth-of-type(1) > h1")).getText()).toBe('Welcome to Caliber!');
      expect(element(by.css("html > body > div > ui-view > ui-view > div:nth-of-type(1) > div:nth-of-type(1) > p")).getText()).toBe('To get started, please visit the user guide for an introduction and orientation.');
      expect(element(by.css("html > body > div > ui-view > ui-view > div:nth-of-type(1) > div:nth-of-type(1) > p > a")).isPresent()).toBe(true);
      element(by.css("html > body")).sendKeys('');
      expect(element(by.css("html > body > div > ui-view > ui-view > div:nth-of-type(1) > div:nth-of-type(1) > p > a")).getText()).toBe('user guide');
      expect(element(by.css("html > body > div > ui-view > ui-view > div:nth-of-type(2) > div > div > div > div > div.col-sm-12.col-md-12 > div > div.panel-heading.panel-rev")).getText()).toBe('Cumulative Scores');
      expect(element(by.css("html > body > div > ui-view > ui-view > div:nth-of-type(2) > div > div > div > div > div.col-sm-12.col-md-12 > div > div.panel-body")).isEnabled()).toBe(true);
      element(by.css("html > body > div > ui-view > ui-view > div:nth-of-type(2) > div > div > div > div > div.col-sm-12.col-md-12 > div > div.panel-body > div")).click();
      expect(element(by.css("html > body > div > ui-view > ui-view > div:nth-of-type(2) > div > div > div > div > div.col-sm-12.col-md-12 > div > div.panel-body")).isPresent()).toBe(true);
      element(by.css("*[id='bar6']")).click();
      element(by.css("*[id='bar6']")).click();
      expect(element(by.css("html > body > div > ui-view > ui-view > div:nth-of-type(2) > div > div > div > div > div:nth-of-type(2) > div > div.panel-heading")).getText()).toBe('Technical Skills');
      expect(element(by.css("*[id='radarBatchOverall']")).isEnabled()).toBe(true);
      expect(element(by.css("*[id='bar6']")).isEnabled()).toBe(true);
      expect(element(by.css("html > body > div > ui-view > ui-view > div:nth-of-type(2) > div > div > div > div > div:nth-of-type(3) > div > div.panel-heading")).getText()).toBe('Last Quality Audit');
      expect(element(by.css("html > body > div > ui-view > ui-view > div:nth-of-type(2) > div > div > div > div > div:nth-of-type(3) > div > div.panel-body > div")).isEnabled()).toBe(true);
      expect(element(by.css("html > body > div > ui-view > ui-view > div:nth-of-type(2) > div > div > div > div > div:nth-of-type(3) > div > div.panel-body > div")).isPresent()).toBe(true);
      expect(element(by.css("html > body > footer > div > div > div > div.col-sm-4 > img")).isPresent()).toBe(true);

      expect(element(by.css("html > body > footer > div > div > div > div.col-sm-3.col-sm-offset-5.contact-info > a:nth-of-type(1)")).getText()).toBe(' (703) 570-8282');
      expect(element(by.css("html > body > footer > div > div > div > div.col-sm-3.col-sm-offset-5.contact-info > a:nth-of-type(2)")).getText()).toBe(' info@revature.com');
      expect(element(by.css("html > body > footer > div > div > div > div.col-sm-3.col-sm-offset-5.contact-info > a:nth-of-type(3)")).getText()).toBe(' revature.com');
      element(by.css("html > body > footer > div > div > div > div.col-sm-3.col-sm-offset-5.contact-info > a:nth-of-type(3)")).sendKeys('');

    });
  });

