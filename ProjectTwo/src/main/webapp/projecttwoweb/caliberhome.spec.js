
describe("Navigate to the Caliber Trainer page", () => {
    beforeAll(() => {
        browser.get("https://dev-caliber.revature.tech");
        browser.sleep(3000);
        browser.navigate().to("https://dev-caliber.revature.tech/caliber/#/trainer/home");
        browser.sleep(3000);
    });
      // browser.driver.manage().window().maximize();
      // browser.get('https://dev-caliber.revature.tech/caliber/#/trainer/home');
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
      });
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
      it('page title matches "Caliber | Performance Management" ', function() {
          expect(browser.getTitle()).toEqual('Caliber | Performance Management')
          });
          it('user guide link is present' , function() {
          expect(element(by.linkText('user guide')).getTagName()).toBe('a');
          });
          it('Click Manage Batch', function () {
              element(by.css("html > body > div > ui-view > nav > div > ul:nth-of-type(2) > li:nth-of-type(2) > a")).click();
          });
          it('year dropdown click 2019' , function() {
              element(by.css("*[id='manage'] > div:nth-of-type(1) > div > div > ul > li.dropdown > a")).click();
              element(by.css("*[id='manage'] > div:nth-of-type(1) > div > div > ul > li.dropdown.open > ul > li:nth-of-type(1) > a")).click();
          });
          it('year dropdown click 2018' , function() {
              element(by.css("*[id='manage'] > div:nth-of-type(1) > div > div > ul > li.dropdown > a")).click();
              element(by.css("*[id='manage'] > div:nth-of-type(1) > div > div > ul > li.dropdown.open > ul > li:nth-of-type(2) > a")).click();
          });
          it('year dropdown click 2017' , function() {
              element(by.css("*[id='manage'] > div:nth-of-type(1) > div > div > ul > li.dropdown > a")).click();
              element(by.css("*[id='manage'] > div:nth-of-type(1) > div > div > ul > li.dropdown.open > ul > li:nth-of-type(3) > a")).click();
          });
          it('year dropdown click 2016' , function() {
              element(by.css("*[id='manage'] > div:nth-of-type(1) > div > div > ul > li.dropdown > a > span")).click();
              element(by.css("*[id='manage'] > div:nth-of-type(1) > div > div > ul > li.dropdown.open > ul > li:nth-of-type(4) > a")).click();
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='manage'] > div:nth-of-type(1) > div > div > ul > li:nth-of-type(3) > a > span")).click();
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='trainingName']")).click();
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='trainingName']")).sendKeys('Training Name');
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='trainingType'] > option:nth-of-type(2)")).click();
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='skillType'] > option:nth-of-type(2)")).click();
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='location'] > optgroup:nth-of-type(1) > option")).click();
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='trainer'] > option:nth-of-type(2)")).click();
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='co-trainer'] > option:nth-of-type(3)")).click();
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='start-date'] > input")).click();
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='end-date'] > input")).click();
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='goodGrade']")).click();
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='goodGrade']")).sendKeys('80');
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='borderlineGrade']")).click();
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='createBatchModal'] > div > div > div.modal-footer > input")).click();
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='checkBatchModal'] > div > div > div.modal-footer > button")).click();
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='start-date'] > input")).click();
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='end-date'] > span")).click();
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='end-date'] > span")).click();
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='end-date'] > input")).click();
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='end-date'] > input")).click();
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='end-date'] > input")).click();
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='end-date'] > input")).click();
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='end-date'] > input")).click();
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='end-date'] > input")).click();
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='end-date'] > input")).click();
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='createBatchModal'] > div > div > div.modal-footer > input")).click();
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='checkBatchModal'] > div > div > div.modal-footer > button")).click();
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='start-date'] > span")).click();
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='start-date'] > span")).click();
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='start-date'] > input")).click();
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='start-date'] > input")).click();
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='start-date'] > input")).click();
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='createBatchModal'] > div > div > div.modal-footer > input")).click();
          });
          it('create batch plus symbol link' , function() {
              element(by.css("*[id='checkBatchModal'] > div > div > div.modal-footer > button")).click();
              element(by.css("*[id='createBatchModal'] > div > div > div.modal-body > div:nth-of-type(4) > div:nth-of-type(1)")).click();
              element(by.css("*[id='co-trainer'] > option:nth-of-type(4)")).click();
              element(by.css("*[id='createBatchModal'] > div > div > div.modal-footer > input")).click();
          });
  
              it('Import Batch link' , function() {
              element(by.css("*[id='manage'] > div:nth-of-type(1) > div > div > ul > li:nth-of-type(2) > a")).click();
              element(by.css("*[id='importId'] > option")).click();
              element(by.css("*[id='importBatchModal'] > div > div > div.modal-footer > input")).click();
              element(by.css("*[id='importBatchModal'] > div > div > div.modal-footer > button")).click();
  
            });
            it('footer website link is present and matches' , function() {
              element(by.css("html > body")).sendKeys(protractor.Key.chord(protractor.Key.CONTROL, '='));
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > thead > tr > th:nth-of-type(1)")).getText()).toBe('Training Name');
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > thead > tr > th:nth-of-type(2)")).getText()).toBe('Training Type');
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > thead > tr > th:nth-of-type(3)")).getText()).toBe('Skill Type');
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > thead > tr > th:nth-of-type(4)")).getText()).toBe('Trainer');
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > thead > tr > th:nth-of-type(5)")).getText()).toBe('Co-Trainer');
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > thead > tr > th:nth-of-type(6)")).getText()).toBe('Location');
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > thead > tr > th:nth-of-type(7)")).getText()).toBe('Start Date');
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > thead > tr > th:nth-of-type(8)")).getText()).toBe('End Date');
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > thead > tr > th:nth-of-type(9)")).getText()).toBe('Good Grade');
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > thead > tr > th:nth-of-type(10)")).getText()).toBe('Passing Grade');
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > thead > tr > th:nth-of-type(11)")).isEnabled()).toBe(true);
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > thead > tr > th:nth-of-type(12)")).isEnabled()).toBe(true);
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > thead > tr > th:nth-of-type(13)")).isEnabled()).toBe(true);
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(1)")).getText()).toBe('1806 NOV08 Java1');
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(2)")).getText()).toBe('Other');
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(3)")).getText()).toBe('SDET');
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(4)")).getText()).toBe('Patrick Walsh');
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(5)")).getText()).toBe('Dan Pickles');
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(6)")).getText()).toBe('Tech Incubator at Queens College, Queens NY 11367');
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(7)")).getText()).toBe('Nov 15, 2016');
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(8)")).getText()).toBe('Nov 25, 2016');
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(9)")).getText()).toBe('21');
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(10)")).getText()).toBe('21');
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(11) > a > span")).getText()).toBe('3');
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(11) > a > span")).click();
            });
            it('create batch plus symbol link' , function() {
              element.all(by.css(" *[id='traineeModalLabel']")).get(0).click();
            });
            it('create batch plus symbol link' , function() {
              expect(element.all(by.css(" *[id='traineeModalLabel']")).get(0).isPresent()).toBe(true);
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(1) > h3")).click();
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(1) > h3")).getText()).toBe('Trainees in Batch');
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(1) > h3")).click();
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(1) > h3")).isPresent()).toBe(true);
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(1) > div > a:nth-of-type(1) > span")).isEnabled()).toBe(true);
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(1) > div > a:nth-of-type(1) > span")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(1) > div > a:nth-of-type(2) > span")).click();
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > thead > tr > th:nth-of-type(1)")).isPresent()).toBe(true);
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > thead > tr > th:nth-of-type(3)")).isPresent()).toBe(true);
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > thead > tr > th:nth-of-type(4)")).isPresent()).toBe(true);
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > thead > tr > th:nth-of-type(5)")).isPresent()).toBe(true);
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > thead > tr > th:nth-of-type(6)")).isPresent()).toBe(true);
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > thead > tr > th:nth-of-type(7)")).isPresent()).toBe(true);
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > thead > tr > th:nth-of-type(8)")).isPresent()).toBe(true);
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > thead > tr > th:nth-of-type(9)")).isPresent()).toBe(true);
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > thead > tr > th:nth-of-type(10)")).isPresent()).toBe(true);
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > thead > tr > th:nth-of-type(11)")).isPresent()).toBe(true);
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > thead > tr > th:nth-of-type(12)")).isPresent()).toBe(true);
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > thead > tr > th:nth-of-type(13)")).isPresent()).toBe(true);
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > thead > tr > th:nth-of-type(14)")).isPresent()).toBe(true);
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > thead > tr > th:nth-of-type(15)")).isPresent()).toBe(true);
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(1)")).isEnabled()).toBe(true);
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(2) > span")).isEnabled()).toBe(true);
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(3)")).isEnabled()).toBe(true);
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(4)")).isEnabled()).toBe(true);
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(5)")).isEnabled()).toBe(true);
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(5)")).isEnabled()).toBe(true);
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(6)")).isEnabled()).toBe(true);
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(7) > span > a > i")).isEnabled()).toBe(true);
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(7) > span > a > i")).isPresent()).toBe(true);
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(2) > span")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(2) > span")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(2)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(2) > span")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(2) > span")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(2) > span")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(7) > span > a > i")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > div > a")).click();
            });
            it('create batch plus symbol link' , function() {
              element.all(by.css(" *[id='traineeName']")).get(0).click();
            });
            it('create batch plus symbol link' , function() {
              element.all(by.css(" *[id='traineeName']")).get(0).sendKeys('david');
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeEmail']")).sendKeys('david');
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeSkype']")).sendKeys('david');
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineePhone']")).sendKeys('david');
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeCollege']")).sendKeys('davdiid');
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeDegree']")).sendKeys('david');
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeMajor']")).sendKeys('');
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeMajor']")).sendKeys('dv');
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeMajor']")).sendKeys('aid');
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeRecruiterName']")).sendKeys('');
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeRecruiterName']")).sendKeys('dv');
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeRecruiterName']")).sendKeys('aid');
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeTechScreenerName']")).sendKeys('v');
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeTechScreenerName']")).sendKeys('d');
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeTechScreenerName']")).sendKeys('aid');
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeProjectCompletion']")).sendKeys('a');
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeProjectCompletion']")).sendKeys('dvid');
            });
            it('create batch plus symbol link' , function() {
              element.all(by.css(" *[id='traineeName']")).get(1).sendKeys('v');
            });
            it('create batch plus symbol link' , function() {
              element.all(by.css(" *[id='traineeName']")).get(1).sendKeys('d');
            });
            it('create batch plus symbol link' , function() {
              element.all(by.css(" *[id='traineeName']")).get(1).sendKeys('aid');
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus']")).sendKeys('');
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus']")).sendKeys('dv');
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus']")).sendKeys('ad');
            });
            it('create batch plus symbol link' , function() {
              element.all(by.css(" *[id='traineeName']")).get(1).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='addTraineeModal'] > div > div > div.modal-body > div:nth-of-type(2) > input:nth-of-type(1)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeEmail']")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeEmail']")).sendKeys('@');
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeEmail']")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeEmail']")).sendKeys('apraart');
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='addTraineeModal'] > div > div > div.modal-body > div:nth-of-type(2) > input:nth-of-type(1)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > div > a > span")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(2)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(3)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(3)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(4)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(4)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(4)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(5)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(5)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(5)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(5)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(6)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(6)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(6)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(6)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(6)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(7)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(7)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(7)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(7)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(7)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(7)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='addTraineeModal'] > div > div > div.modal-body > div:nth-of-type(1) > div:nth-of-type(7) > div")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(8)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(8)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(8)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(8)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(8)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(8)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(8)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='addTraineeModal'] > div > div > div.modal-body > div:nth-of-type(2) > button:nth-of-type(1)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(14) > a > span")).click();
            });
            it('create batch plus symbol link' , function() {
              browser.actions().dragAndDrop(
          element.all(by.css(" *[id='traineeName']")).get(0),
          {"x":-237,"y":-2}
      ).perform();
              element.all(by.css(" *[id='traineeName']")).get(0).sendKeys('');
              browser.actions().dragAndDrop(
          element(by.css("*[id='traineeEmail']")),
          {"x":-328,"y":-30}
      ).perform();
              element(by.css("*[id='traineeEmail']")).sendKeys('');
              browser.actions().dragAndDrop(
          element(by.css("*[id='traineeSkype']")),
          {"x":-172,"y":24}
      ).perform();
              element(by.css("*[id='traineeSkype']")).sendKeys('');
              browser.actions().dragAndDrop(
          element(by.css("*[id='traineePhone']")),
          {"x":-497,"y":14}
      ).perform();
              element(by.css("*[id='traineePhone']")).sendKeys('');
              browser.actions().dragAndDrop(
          element(by.css("*[id='traineeDegree']")),
          {"x":-446,"y":2}
      ).perform();
              element(by.css("*[id='traineeDegree']")).sendKeys('');
              browser.actions().dragAndDrop(
          element(by.css("*[id='traineeCollege']")),
          {"x":-284,"y":-19}
      ).perform();
              element(by.css("*[id='traineeCollege']")).sendKeys('');
              browser.actions().dragAndDrop(
          element(by.css("*[id='traineeMajor']")),
          {"x":-262,"y":28}
      ).perform();
              element(by.css("*[id='traineeMajor']")).sendKeys('');
              browser.actions().dragAndDrop(
          element(by.css("*[id='traineeRecruiterName']")),
          {"x":-512,"y":35}
      ).perform();
              element(by.css("*[id='traineeRecruiterName']")).sendKeys('');
              browser.actions().dragAndDrop(
          element(by.css("*[id='traineeProjectCompletion']")),
          {"x":-305,"y":-2}
      ).perform();
              element(by.css("*[id='traineeProjectCompletion']")).sendKeys('');
              browser.actions().dragAndDrop(
          element(by.css("*[id='traineeTechScreenerName']")),
          {"x":-201,"y":0}
      ).perform();
              element(by.css("*[id='traineeTechScreenerName']")).sendKeys('');
              browser.actions().dragAndDrop(
          element.all(by.css(" *[id='traineeName']")).get(1),
          {"x":-277,"y":30}
      ).perform();
              element.all(by.css(" *[id='traineeName']")).get(1).sendKeys('');
              browser.actions().dragAndDrop(
          element(by.css("*[id='traineeStatus']")),
          {"x":-227,"y":34}
      ).perform();
    });
    it('create batch plus symbol link' , function() {
              element(by.css("*[id='addTraineeModal'] > div > div > div.modal-body > div:nth-of-type(2) > input:nth-of-type(2)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='addTraineeModal'] > div > div > div.modal-body > div:nth-of-type(2) > button:nth-of-type(2)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(15) > a > span")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='deleteTraineeModal'] > div > div > div.modal-header > button > span")).click();
            });
            it('create batch plus symbol link' , function() {
              element.all(by.css(" *[id='traineeModalLabel']")).get(0).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-header > button > span")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(13) > a > span")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='deleteBatchModal'] > div > div > div.modal-footer > input")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='deleteBatchErrorModal'] > div > div > div.modal-footer > button")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(12) > a > span")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='co-trainer'] > option:nth-of-type(4)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='co-trainer'] > option:nth-of-type(4)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='createBatchModal'] > div > div > div.modal-footer > input")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(3) > td:nth-of-type(11) > a > span")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(14) > a > span")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(8)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(8)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(8)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(8)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(8)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(8)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(8)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='traineeStatus'] > option:nth-of-type(8)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='addTraineeModal'] > div > div > div.modal-body > div:nth-of-type(2) > input:nth-of-type(2)")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(1) > div > a:nth-of-type(1) > span")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-header > button > span")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(3) > td:nth-of-type(13) > a > span")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='deleteBatchModal'] > div > div > div.modal-footer > input")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='deleteBatchErrorModal'] > div > div > div.modal-footer > button")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(2) > td:nth-of-type(13) > a > span")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='deleteBatchModal'] > div > div > div.modal-footer > input")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("html > body > div")).click();
            });
            it('create batch plus symbol link' , function() {
             
              element(by.css("*[id='manage'] > div:nth-of-type(1) > div > div > ul > li.dropdown > a")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='manage'] > div:nth-of-type(1) > div > div > ul > li.dropdown.open > ul > li:nth-of-type(3) > a")).click();
            });
            it('create batch plus symbol link' , function() {
             
      
              element(by.css("*[id='manage'] > div:nth-of-type(1) > div > div > ul > li.dropdown > a")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='manage'] > div:nth-of-type(1) > div > div > ul > li.dropdown.open > ul > li:nth-of-type(2) > a")).click();
            });
            it('create batch plus symbol link' , function() {
  
              element(by.css("*[id='manage'] > div:nth-of-type(1) > div > div > ul > li.dropdown > a")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='manage'] > div:nth-of-type(1) > div > div > ul > li.dropdown.open > ul")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='manage'] > div:nth-of-type(1) > div > div > ul > li.dropdown > a")).click();
            });
            it('create batch plus symbol link' , function() {
              element(by.css("*[id='manage'] > div:nth-of-type(1) > div > div > ul > li.dropdown.open > ul > li:nth-of-type(1) > a")).click();
            });
            it('create batch plus symbol link' , function() {
      
              expect(element(by.css("*[id='manage'] > div:nth-of-type(1) > div > div > ul")).isPresent()).toBe(true);
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("html > body > footer > div > div > div > div.col-sm-4 > img")).isEnabled()).toBe(true);
            });
            it('create batch plus symbol link' , function() {
              expect(element(by.css("html > body > footer > div > div > div > div.col-sm-3.col-sm-offset-5.contact-info > a:nth-of-type(1)")).getText()).toBe(' (703) 570-8282');
              window.open('C:\Project2\Project2\ProjectTwo\src\main\webapp\projecttwoweb\report\report.html', '_self');
          });
      });

    