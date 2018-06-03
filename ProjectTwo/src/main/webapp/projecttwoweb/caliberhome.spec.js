
describe('Caliber homepage check HTML elements are present', function() {
      browser.driver.manage().window().maximize();
      browser.get('http://dev-caliber.revature.tech/caliber/#/routing/');
      it('page title matches "Caliber | Performance Management" ', function() {
      expect(browser.getTitle()).toEqual('Caliber | Performance Management')
      });
      it('user guide link is present' , function() {
      expect(element(by.linkText('user guide')).getTagName()).toBe('a');
      });
      it('NAVBAR LOGO link is present' , function() {
      expect(element(by.css("html > body > div > ui-view > nav > div > ul:nth-of-type(1) > li > a")).isPresent()).toBe(true);
      });
      it('NAVBAR Home link is present' , function() {
      expect(element(by.css("html > body > div > ui-view > nav > div > ul:nth-of-type(2) > li:nth-of-type(1) > a")).isPresent()).toBe(true);
      });
      it('NAVBAR Assess Batch link is present' , function() {
      expect(element(by.css("html > body > div > ui-view > nav > div > ul:nth-of-type(2) > li:nth-of-type(3) > a")).isPresent()).toBe(true);
      });
      it('NAVBAR Manage Batch link is present' , function() {
      expect(element(by.css("html > body > div > ui-view > nav > div > ul:nth-of-type(2) > li:nth-of-type(2) > a")).isPresent()).toBe(true);
      });
      it('NAVBAR Reports link is present' , function() {
      expect(element(by.css("html > body > div > ui-view > nav > div > ul:nth-of-type(2) > li:nth-of-type(4) > a")).isPresent()).toBe(true);
      });
      it('h1 titile matches Welcome to Caliber!' , function() {
      expect(element(by.css("html > body > div > ui-view > ui-view > div:nth-of-type(1) > h1")).getText()).toBe('Welcome to Caliber!');
      });
      it(' p welcome paragraph matches to get started,....' , function() {
      expect(element(by.css("html > body > div > ui-view > ui-view > div:nth-of-type(1) > div:nth-of-type(1) > p")).getText()).toBe('To get started, please visit the user guide for an introduction and orientation.');
      });
      it('Cumulative scores element present' , function() {
      expect(element(by.css("html > body > div > ui-view > ui-view > div:nth-of-type(1) > div:nth-of-type(1) > p > a")).isPresent()).toBe(true);
      });
      it('NAVBAR HOME link is present' , function() {
      element(by.css("html > body")).sendKeys('');
      it('NAVBAR HOME link is present' , function() {
      expect(element(by.css("html > body > div > ui-view > ui-view > div:nth-of-type(1) > div:nth-of-type(1) > p > a")).getText()).toBe('user guide');
      });
      it('Cumulative Scores title is present' , function() {
      expect(element(by.css("html > body > div > ui-view > ui-view > div:nth-of-type(2) > div > div > div > div > div.col-sm-12.col-md-12 > div > div.panel-heading.panel-rev")).getText()).toBe('Cumulative Scores');
      });
      it('Cumulative scores body container is enabled' , function() {
      expect(element(by.css("html > body > div > ui-view > ui-view > div:nth-of-type(2) > div > div > div > div > div.col-sm-12.col-md-12 > div > div.panel-body")).isEnabled()).toBe(true);
      });
      it('Cumulative scores individual bar info option is clickable' , function() {
      element(by.css("html > body > div > ui-view > ui-view > div:nth-of-type(2) > div > div > div > div > div.col-sm-12.col-md-12 > div > div.panel-body > div")).click();
      });
      it('Cumulative scores body container is present' , function() {
      expect(element(by.css("html > body > div > ui-view > ui-view > div:nth-of-type(2) > div > div > div > div > div.col-sm-12.col-md-12 > div > div.panel-body")).isPresent()).toBe(true);
      });
      it('Cumulative scores batch scores option is clickable' , function() {
      element(by.css("*[id='bar6']")).click();
      });
      it('Cumulative scores Benchmark option is clickable' , function() {
      element(by.css("*[id='bar6']")).click();
      });
      it('container title matches technical skills  ' , function() {
      expect(element(by.css("html > body > div > ui-view > ui-view > div:nth-of-type(2) > div > div > div > div > div:nth-of-type(2) > div > div.panel-heading")).getText()).toBe('Technical Skills');
      });
      it('NAVBAR HOME link is present' , function() {
      expect(element(by.css("*[id='radarBatchOverall']")).isEnabled()).toBe(true);
      });
      it('NAVBAR HOME link is present' , function() {
      expect(element(by.css("*[id='bar6']")).isEnabled()).toBe(true);
      });
      it('last quality audit container title matches ' , function() {
      expect(element(by.css("html > body > div > ui-view > ui-view > div:nth-of-type(2) > div > div > div > div > div:nth-of-type(3) > div > div.panel-heading")).getText()).toBe('Last Quality Audit');
      });
      it('last quality audit body container is enabled' , function() {
      expect(element(by.css("html > body > div > ui-view > ui-view > div:nth-of-type(2) > div > div > div > div > div:nth-of-type(3) > div > div.panel-body > div")).isEnabled()).toBe(true);
      });
      it('last quality audit body container is present' , function() {
      expect(element(by.css("html > body > div > ui-view > ui-view > div:nth-of-type(2) > div > div > div > div > div:nth-of-type(3) > div > div.panel-body > div")).isPresent()).toBe(true);
      });
      it('footer revature logo link is present' , function() {
      expect(element(by.css("html > body > footer > div > div > div > div.col-sm-4 > img")).isPresent()).toBe(true);
      });
      it('footer phone number is present and matchest' , function() {
      expect(element(by.css("html > body > footer > div > div > div > div.col-sm-3.col-sm-offset-5.contact-info > a:nth-of-type(1)")).getText()).toBe(' (703) 570-8282');
      });
      it('footer info email link is present and matches' , function() {
      expect(element(by.css("html > body > footer > div > div > div > div.col-sm-3.col-sm-offset-5.contact-info > a:nth-of-type(2)")).getText()).toBe(' info@revature.com');
      });
      it('footer website link is present and matches' , function() {
      expect(element(by.css("html > body > footer > div > div > div > div.col-sm-3.col-sm-offset-5.contact-info > a:nth-of-type(3)")).getText()).toBe(' revature.com');
      });

    })});
