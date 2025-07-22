class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       int startingColor = image[sr][sc];
        if (startingColor == color) {
            return image;
        }
        fillColor(image, sr, sc, startingColor, color);
        
        return image;
    }

    private void fillColor(int[][] image, int sr, int sc, int startingColor, int newColor) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) {
            return;
        }
        if (image[sr][sc] != startingColor) {
            return;
        }
        image[sr][sc] = newColor;
        fillColor(image, sr + 1, sc, startingColor, newColor);
        fillColor(image, sr - 1, sc, startingColor, newColor);
        fillColor(image, sr, sc + 1, startingColor, newColor);
        fillColor(image, sr, sc - 1, startingColor, newColor);
    }
    }
