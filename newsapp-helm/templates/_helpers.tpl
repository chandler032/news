{{- define "newsapp.fullname" -}}
{{ .Release.Name }}-{{ .Chart.Name }}
{{- end }}