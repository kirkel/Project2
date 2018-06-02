var PrettyReporter = require('protractor-pretty-html-reporter').Reporter;

var prettyReporter = new PrettyReporter({
    // required, there is no default
    path: __dirname + '/report',
    screenshotOnPassed: true
});

exports.config = {
  specs: ['caliberhome.spec.js'],
    /* the rest of the object omitted */
    onPrepare: function() {
        jasmine.getEnv().addReporter(prettyReporter);
    },
    /* if using isSharded option see below */
    beforeLaunch() {
        prettyReporter.startReporter();
    }
};



