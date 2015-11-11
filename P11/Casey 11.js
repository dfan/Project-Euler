
var fs = require('fs');
var colors = require ('colors');

var gridText = fs.readFileSync('./11.input.txt')
             .toString()

var grid = gridText
             .split(/\r?\n/)
             .map(function (line) { return line.split(/\s/); })
             .map(function (row){
                 return row.map(function(cell) {
                     return +cell; // cast to integer
                 });
             });

var curProduct = 1;
var max = 0;

//Horizontal 
console.log('Horizontal'.red);
for (var row = grid.length - 1; row >= 0; row--) {
    for (var col = grid[row].length - 4; col >= 0; col--) {
        curProduct = grid[row][col] * grid[row][col+1] * grid[row][col+2] * grid[row][col+3];
        if (curProduct > max) { 
            max = curProduct;
            console.log('New Max'.green, curProduct);
        };
    };
};

//Vertical
console.log('Vertical'.red);
for (var row = grid.length - 4; row >= 0; row--) {
    for (var col = grid[row].length - 1; col >= 0; col--) {
        curProduct = grid[row][col] * grid[row+1][col] * grid[row+2][col] * grid[row+3][col];
        if (curProduct > max) { 
            max = curProduct;
            console.log('New Max'.green, curProduct);
        };
    };
};

//Diagnol Down
console.log('Diagnol Down'.red);
for (var row = grid.length - 4; row >= 0; row--) {
    for (var col = grid[row].length - 4; col >= 0; col--) {
        curProduct = grid[row][col] * grid[row+1][col+1] * grid[row+2][col+2] * grid[row+3][col+3];
        if (curProduct > max) { 
            max = curProduct;
            console.log('New Max'.green, curProduct);
        };
    };
};

//Diagnol Up
console.log('Diagnol Up'.red);
for (var row = grid.length - 1; row >= 3; row--) {
    for (var col = grid[row].length - 4; col >= 0; col--) {
        curProduct = grid[row][col] * grid[row-1][col+1] * grid[row-2][col+2] * grid[row-3][col+3];
        if (curProduct > max) { 
            max = curProduct;
            console.log('New Max'.green, curProduct);
        };
    };
};

console.log(max);