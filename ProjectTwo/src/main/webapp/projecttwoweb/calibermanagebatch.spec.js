describe('Caliber homepage check HTML elements are present', function() {
    browser.driver.manage().window().maximize();
    browser.get('http://dev-caliber.revature.tech/caliber/#/routing/');
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


            element(by.css("html > body")).sendKeys(protractor.Key.chord(protractor.Key.CONTROL, '='));

            it('Check table headers match exptected titles' , function() {
            expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > thead > tr > th:nth-of-type(1)")).getText()).toBe('Training Name');
            expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > thead > tr > th:nth-of-type(2)")).getText()).toBe('Training Type');
            expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > thead > tr > th:nth-of-type(3)")).getText()).toBe('Skill Type');
            expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > thead > tr > th:nth-of-type(4)")).getText()).toBe('Trainer');
            expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > thead > tr > th:nth-of-type(5)")).getText()).toBe('Co-Trainer');
            expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > thead > tr > th:nth-of-type(6)")).getText()).toBe('Location');
            expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > thead > tr > th:nth-of-type(7)")).getText()).toBe('Start Date');
            expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > thead > tr > th:nth-of-type(8)")).getText()).toBe('End Date');
            expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > thead > tr > th:nth-of-type(9)")).getText()).toBe('Good Grade');
            expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > thead > tr > th:nth-of-type(10)")).getText()).toBe('Passing Grade');
            expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > thead > tr > th:nth-of-type(11)")).isEnabled()).toBe(true);
            expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > thead > tr > th:nth-of-type(12)")).isEnabled()).toBe(true);
            expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > thead > tr > th:nth-of-type(13)")).isEnabled()).toBe(true);
            expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(1)")).getText()).toBe('1806 NOV08 Java1');
            expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(2)")).getText()).toBe('Other');
            expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(3)")).getText()).toBe('SDET');
            expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(4)")).getText()).toBe('Patrick Walsh');
            expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(5)")).getText()).toBe('Dan Pickles');
            expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(6)")).getText()).toBe('Tech Incubator at Queens College, Queens NY 11367');
            expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(7)")).getText()).toBe('Nov 15, 2016');
            expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(8)")).getText()).toBe('Nov 25, 2016');
            expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(9)")).getText()).toBe('21');
            expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(10)")).getText()).toBe('21');
            expect(element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(11) > a > span")).getText()).toBe('3');
            element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(11) > a > span")).click();
            element.all(by.css(" *[id='traineeModalLabel']")).get(0).click();
            expect(element.all(by.css(" *[id='traineeModalLabel']")).get(0).isPresent()).toBe(true);
            element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(1) > h3")).click();
            expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(1) > h3")).getText()).toBe('Trainees in Batch');
            element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(1) > h3")).click();
            expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(1) > h3")).isPresent()).toBe(true);
            expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(1) > div > a:nth-of-type(1) > span")).isEnabled()).toBe(true);
            element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(1) > div > a:nth-of-type(1) > span")).click();
            element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(1) > div > a:nth-of-type(2) > span")).click();
            expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > thead > tr > th:nth-of-type(1)")).isPresent()).toBe(true);
            expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > thead > tr > th:nth-of-type(3)")).isPresent()).toBe(true);
            expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > thead > tr > th:nth-of-type(4)")).isPresent()).toBe(true);
            expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > thead > tr > th:nth-of-type(5)")).isPresent()).toBe(true);
            expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > thead > tr > th:nth-of-type(6)")).isPresent()).toBe(true);
            expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > thead > tr > th:nth-of-type(7)")).isPresent()).toBe(true);
            expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > thead > tr > th:nth-of-type(8)")).isPresent()).toBe(true);
            expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > thead > tr > th:nth-of-type(9)")).isPresent()).toBe(true);
            expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > thead > tr > th:nth-of-type(10)")).isPresent()).toBe(true);
            expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > thead > tr > th:nth-of-type(11)")).isPresent()).toBe(true);
            expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > thead > tr > th:nth-of-type(12)")).isPresent()).toBe(true);
            expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > thead > tr > th:nth-of-type(13)")).isPresent()).toBe(true);
            expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > thead > tr > th:nth-of-type(14)")).isPresent()).toBe(true);
            expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > thead > tr > th:nth-of-type(15)")).isPresent()).toBe(true);
            expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(1)")).isEnabled()).toBe(true);
            expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(2) > span")).isEnabled()).toBe(true);
            expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(3)")).isEnabled()).toBe(true);
            expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(4)")).isEnabled()).toBe(true);
            expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(5)")).isEnabled()).toBe(true);
            expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(5)")).isEnabled()).toBe(true);
            expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(6)")).isEnabled()).toBe(true);
            expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(7) > span > a > i")).isEnabled()).toBe(true);
            expect(element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(7) > span > a > i")).isPresent()).toBe(true);
            element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(2) > span")).click();
            element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(2) > span")).click();
            element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(2)")).click();
            element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(2) > span")).click();
            element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(2) > span")).click();
            element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(2) > span")).click();
            element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(7) > span > a > i")).click();
            element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > div > a")).click();
            element.all(by.css(" *[id='traineeName']")).get(0).click();
            element.all(by.css(" *[id='traineeName']")).get(0).sendKeys('david');
            element(by.css("*[id='traineeEmail']")).sendKeys('david');
            element(by.css("*[id='traineeSkype']")).sendKeys('david');
            element(by.css("*[id='traineePhone']")).sendKeys('david');
            element(by.css("*[id='traineeCollege']")).sendKeys('davdiid');
            element(by.css("*[id='traineeDegree']")).sendKeys('david');
            element(by.css("*[id='traineeMajor']")).sendKeys('');
            element(by.css("*[id='traineeMajor']")).sendKeys('dv');
            element(by.css("*[id='traineeMajor']")).sendKeys('aid');
            element(by.css("*[id='traineeRecruiterName']")).sendKeys('');
            element(by.css("*[id='traineeRecruiterName']")).sendKeys('dv');
            element(by.css("*[id='traineeRecruiterName']")).sendKeys('aid');
            element(by.css("*[id='traineeTechScreenerName']")).sendKeys('v');
            element(by.css("*[id='traineeTechScreenerName']")).sendKeys('d');
            element(by.css("*[id='traineeTechScreenerName']")).sendKeys('aid');
            element(by.css("*[id='traineeProjectCompletion']")).sendKeys('a');
            element(by.css("*[id='traineeProjectCompletion']")).sendKeys('dvid');
            element.all(by.css(" *[id='traineeName']")).get(1).sendKeys('v');
            element.all(by.css(" *[id='traineeName']")).get(1).sendKeys('d');
            element.all(by.css(" *[id='traineeName']")).get(1).sendKeys('aid');
            element(by.css("*[id='traineeStatus']")).sendKeys('');
            element(by.css("*[id='traineeStatus']")).sendKeys('dv');
            element(by.css("*[id='traineeStatus']")).sendKeys('ad');
            element.all(by.css(" *[id='traineeName']")).get(1).click();
            element(by.css("*[id='addTraineeModal'] > div > div > div.modal-body > div:nth-of-type(2) > input:nth-of-type(1)")).click();
            element(by.css("*[id='traineeEmail']")).click();
            element(by.css("*[id='traineeEmail']")).sendKeys('@');
            element(by.css("*[id='traineeEmail']")).click();
            element(by.css("*[id='traineeEmail']")).sendKeys('apraart');
            element(by.css("*[id='addTraineeModal'] > div > div > div.modal-body > div:nth-of-type(2) > input:nth-of-type(1)")).click();
            element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > div > a > span")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(2)")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(3)")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(3)")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(4)")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(4)")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(4)")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(5)")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(5)")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(5)")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(5)")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(6)")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(6)")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(6)")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(6)")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(6)")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(7)")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(7)")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(7)")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(7)")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(7)")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(7)")).click();
            element(by.css("*[id='addTraineeModal'] > div > div > div.modal-body > div:nth-of-type(1) > div:nth-of-type(7) > div")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(8)")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(8)")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(8)")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(8)")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(8)")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(8)")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(8)")).click();
            element(by.css("*[id='addTraineeModal'] > div > div > div.modal-body > div:nth-of-type(2) > button:nth-of-type(1)")).click();
            element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(14) > a > span")).click();
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
            element(by.css("*[id='addTraineeModal'] > div > div > div.modal-body > div:nth-of-type(2) > input:nth-of-type(2)")).click();
            element(by.css("*[id='addTraineeModal'] > div > div > div.modal-body > div:nth-of-type(2) > button:nth-of-type(2)")).click();
            element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(15) > a > span")).click();
            element(by.css("*[id='deleteTraineeModal'] > div > div > div.modal-header > button > span")).click();
            element.all(by.css(" *[id='traineeModalLabel']")).get(0).click();
            element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-header > button > span")).click();
            element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(13) > a > span")).click();
            element(by.css("*[id='deleteBatchModal'] > div > div > div.modal-footer > input")).click();
            element(by.css("*[id='deleteBatchErrorModal'] > div > div > div.modal-footer > button")).click();
            element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(12) > a > span")).click();
            element(by.css("*[id='co-trainer'] > option:nth-of-type(4)")).click();
            element(by.css("*[id='co-trainer'] > option:nth-of-type(4)")).click();
            element(by.css("*[id='createBatchModal'] > div > div > div.modal-footer > input")).click();
            element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(3) > td:nth-of-type(11) > a > span")).click();
            element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(2) > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(14) > a > span")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(8)")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(8)")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(8)")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(8)")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(8)")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(8)")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(8)")).click();
            element(by.css("*[id='traineeStatus'] > option:nth-of-type(8)")).click();
            element(by.css("*[id='addTraineeModal'] > div > div > div.modal-body > div:nth-of-type(2) > input:nth-of-type(2)")).click();
            element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-body.only-top-padding > div:nth-of-type(1) > div > a:nth-of-type(1) > span")).click();
            element(by.css("*[id='viewTraineeModal'] > div > div > div.modal-header > button > span")).click();
            element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(3) > td:nth-of-type(13) > a > span")).click();
            element(by.css("*[id='deleteBatchModal'] > div > div > div.modal-footer > input")).click();
            element(by.css("*[id='deleteBatchErrorModal'] > div > div > div.modal-footer > button")).click();
            element(by.css("*[id='manage'] > div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(2) > td:nth-of-type(13) > a > span")).click();
            element(by.css("*[id='deleteBatchModal'] > div > div > div.modal-footer > input")).click();
            element(by.css("html > body > div")).click();
            expect(element(by.css("*[id='manage']")).getText()).toBe('2016
    Import Batch
    Create Batch
    Training Name Training Type Skill Type Trainer Co-Trainer Location Start Date End Date Good Grade Passing Grade
    1806 NOV08 Java1 Other SDET Patrick Walsh Name Tech Incubator at Queens College, Queens NY 11367 Nov 15, 2016 Nov 25, 2016 21 21
    3
    q University SDET Patrick Walsh Tech Incubator at Queens College, Queens NY 11367 Nov 12, 2016 Dec 13, 2016 11 11
    1
    aPQ9DUTEF3NP7P8 Revature J2EE Patrick Walsh Tech Incubator at Queens College, Queens NY 11367 Jun 20, 2016 Aug 24, 2016 100 80
    10
    aPQ9DUTEF3NP7P8 Revature J2EE Patrick Walsh Tech Incubator at Queens College, Queens NY 11367 Jun 20, 2016 Aug 24, 2016 100 80
    0
    aPQ9DUTEF3NP7P8 Revature J2EE Patrick Walsh Tech Incubator at Queens College, Queens NY 11367 Jun 20, 2016 Aug 24, 2016 100 80
    10
    aPQ9DUTEF3NP7P8 Revature J2EE Patrick Walsh Tech Incubator at Queens College, Queens NY 11367 Jun 20, 2016 Aug 24, 2016 100 80
    0
    a0CG9VQ0VCMJ6WW Revature Microservices Patrick Walsh Revature LLC, Reston VA 20190 Apr 15, 2016 Oct 18, 2016 100 80
    10
    aUDHNU0Y89M41QC Other QA Patrick Walsh Revature LLC, Reston VA 20190 Feb 10, 2016 Oct 26, 2016 100 80
    17');
            element(by.css("*[id='manage'] > div:nth-of-type(1) > div > div > ul > li.dropdown > a")).click();
            element(by.css("*[id='manage'] > div:nth-of-type(1) > div > div > ul > li.dropdown.open > ul > li:nth-of-type(3) > a")).click();
            expect(element(by.css("*[id='manage']")).getText()).toBe('2017
    Import Batch
    Create Batch
    Training Name Training Type Skill Type Trainer Co-Trainer Location Start Date End Date Good Grade Passing Grade
    batchwithgooddates Revature J2EE Patrick Walsh Tech Incubator at Queens College, Queens NY 11367 Jan 1, 2017 Jan 2, 2017 10 10
    0
    Training Name Revature J2EE 123 Name Tech Incubator at Queens College, Queens NY 11367 Oct 2, 2017 Nov 2, 2018 80 80
    0');
            element(by.css("*[id='manage'] > div:nth-of-type(1) > div > div > ul > li.dropdown > a")).click();
            element(by.css("*[id='manage'] > div:nth-of-type(1) > div > div > ul > li.dropdown.open > ul > li:nth-of-type(2) > a")).click();
            expect(element(by.css("*[id='manage']")).getText()).toBe('2018
    Import Batch
    Create Batch
    Training Name Training Type Skill Type Trainer Co-Trainer Location Start Date End Date Good Grade Passing Grade
    1611 Nov14 JavaScript Corporate BPM Dan Pickles Patrick Walsh Revature LLC, Reston VA 20190 Jun 5, 2018 Jul 1, 2018 80 70
    1
    1611 Nov14 Java (AP) Corporate Appian BPM Genesis Bonds Patrick Walsh Revature LLC, Reston VA 20190 Feb 7, 2018 Jun 5, 2018 80 80
    0');
            element(by.css("*[id='manage'] > div:nth-of-type(1) > div > div > ul > li.dropdown > a")).click();
            element(by.css("*[id='manage'] > div:nth-of-type(1) > div > div > ul > li.dropdown.open > ul")).click();
            element(by.css("*[id='manage'] > div:nth-of-type(1) > div > div > ul > li.dropdown > a")).click();
            element(by.css("*[id='manage'] > div:nth-of-type(1) > div > div > ul > li.dropdown.open > ul > li:nth-of-type(1) > a")).click();
            expect(element(by.css("*[id='manage']")).getText()).toBe('2019
    Import Batch
    Create Batch
    Training Name Training Type Skill Type Trainer Co-Trainer Location Start Date End Date Good Grade Passing Grade
    q3 Other Appian BPM Ryan Lessley Patrick Walsh Tech Incubator at Queens College, Queens NY 11367 May 25, 2019 May 26, 2019 12 1
    8
    The Batch Corporate .NET Patrick Walsh Revature LLC, Reston VA 20190 Jan 27, 2019 Jul 27, 2019 50 20
    0
    The Batch Corporate .NET Patrick Walsh Ryan Lessley Revature LLC, Reston VA 20190 Jan 27, 2019 Jul 27, 2019 50 20
    0
    The Batch Corporate .NET Patrick Walsh Revature LLC, Reston VA 20190 Jan 27, 2019 Jul 27, 2019 50 20
    0
    The Batch Corporate .NET Patrick Walsh Ryan Lessley Revature LLC, Reston VA 20190 Jan 27, 2019 Jul 27, 2019 50 20
    0');
            expect(element(by.css("*[id='manage'] > div:nth-of-type(1) > div > div > ul")).isPresent()).toBe(true);
            expect(element(by.css("html > body > footer > div > div > div > div.col-sm-4 > img")).isEnabled()).toBe(true);
            expect(element(by.css("html > body > footer > div > div > div > div.col-sm-3.col-sm-offset-5.contact-info > span:nth-of-type(2)")).getText()).toBe(' 11730 Plaza America Drive
    Reston, VA 20190');
            expect(element(by.css("html > body > footer > div > div > div > div.col-sm-3.col-sm-offset-5.contact-info > a:nth-of-type(1)")).getText()).toBe(' (703) 570-8282');
        });
    });


















    });
