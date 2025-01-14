from django.db import models


class Article(models.Model):
	article_title = models.CharField(max_length=100)
	article_text = models.TextField()

	def __str__(self):
		return self.article_title
