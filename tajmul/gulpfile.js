var gulp      = require('gulp'),
    sass      = require('gulp-sass'),
    
    cssmin    = require('gulp-cssmin'),
    rename    = require('gulp-rename');


gulp.task('sass', function () {
  gulp.src('./scss/style.scss')
    .pipe(sass().on('error', sass.logError))
    .pipe(gulp.dest('./css'))
    .pipe(rename({suffix: '-min'}))
    .pipe(cssmin())
    .pipe(gulp.dest('./css'))
});

gulp.task('html', function () {
  gulp.src('./*.html')
    .pipe(connect.reload());
});



gulp.task('watch',function(){
  gulp.watch(['scss/**/*.scss'],['sass']);
});

gulp.task('default',['sass','watch']);